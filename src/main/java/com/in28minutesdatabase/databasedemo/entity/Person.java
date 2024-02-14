package com.in28minutesdatabase.databasedemo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
// @Table(name = "person")
public class Person {

  @Id
  @GeneratedValue
  private int id;

  // @Column(name="name")
  private String name;
  private String location;
  private Date birthDate;

  public Person() {}

  public Person(int id, String name, String location, Date birthDate) {
    super();
    this.id = id;
    this.name = name;
    this.location = location;
    this.birthDate = birthDate;
  }

  // Constructor without Id 
  public Person(String name, String location, Date birthDate) {
    super();
    this.name = name;
    this.location = location;
    this.birthDate = birthDate;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getLocation() {
    return location;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return (
      "\nPerson [id=" +
      id +
      ", name=" +
      name +
      ", location=" +
      location +
      ", birthDate=" +
      birthDate +
      "]"
    );
  }
}
