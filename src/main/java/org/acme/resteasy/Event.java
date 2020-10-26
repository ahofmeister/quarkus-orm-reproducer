package org.acme.resteasy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Alexander Hofmeister
 */
@Entity
public class Event {

  public String name;

  @Id
  @GeneratedValue
  public Long id;

  // NOTE: NO getters and setters!
}
