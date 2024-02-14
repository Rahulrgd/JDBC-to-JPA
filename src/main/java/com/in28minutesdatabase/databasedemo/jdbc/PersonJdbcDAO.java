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

  public Person findById(int id) {
    return (Person) jdbcTemplate.queryForObject(
      "Select * from person where id=?", new Object[]{id},
      new BeanPropertyRowMapper(Person.class)
    );
  }

  public int deleteById(int id) {
    return jdbcTemplate.update(
      "delete from person where id=?", new Object[]{id});
  }

  public int insert(Person person) {
    return jdbcTemplate.update("insert into person(id, name, location, birth_date) values(?, ?, ?, ?);", new Object[]{person.getId(), person.getName(), person.getLocation(), person.getBirthDate()});
  }

  public int update(Person person) {
    return jdbcTemplate.update("update person set name=?, location = ?, birth_date=? where id=?;", new Object[]{person.getName(), person.getLocation(), person.getBirthDate(), person.getId()});
  }
}
