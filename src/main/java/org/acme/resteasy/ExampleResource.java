package org.acme.resteasy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.TransactionScoped;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/events")
@ApplicationScoped
public class ExampleResource {

  @Inject
  EntityManager entityManager;

  @POST
  @Transactional
  public void addEntities() {
    Event event = new Event();
    event.name = "inital";
    entityManager.persist(event);

    EventWithGettersSetters eventWithGettersSetters = new EventWithGettersSetters();
    eventWithGettersSetters.setName("inital");
    entityManager.persist(eventWithGettersSetters);
  }

  @PATCH
  @Transactional
  public void patch() {
    entityManager.find(Event.class, 1L).name = "new one";
    entityManager.find(EventWithGettersSetters.class, 2L).setName("new one");

    // in the db, only the entity EventWithGettersSetters is updated correctly!
  }
}
