package com.in28minutesdatabase.databasedemo.jdbc;

import com.in28minutesdatabase.databasedemo.entity.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcDAO {

  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<Person> findAll() {
    return jdbcTemplate.query(
      "Select * from person",
      new BeanPropertyRowMapper(Person.class)
    );
  }
}
