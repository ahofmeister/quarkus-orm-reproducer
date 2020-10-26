package org.acme.resteasy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Alexander Hofmeister
 */
@Entity
public class EventWithGettersSetters {

  private String name;

  @Id
  @GeneratedValue
  public Long id;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
