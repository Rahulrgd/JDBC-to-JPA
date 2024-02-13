package com.in28minutesdatabase.databasedemo.entity;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private String location;
    private Date birthDate;
    public Person(int id, String name, String location, Date birthDate) {
        this.id = id;
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

    
}
