package com.in28minutesdatabase.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutesdatabase.databasedemo.entity.Person;
import com.in28minutesdatabase.databasedemo.jdbc.PersonJdbcDAO;
import com.in28minutesdatabase.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{

	@Autowired
	PersonJpaRepository repository;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("\nUser id 10001 -> {}",  repository.findById(10001));
		// logger.info("All user -> {}",  dao.findAll());
		// logger.info("\nDeleting User 10001 and number of rows affected -> {}",  dao.deleteById(10001));
		// logger.info("\nInsert new User -> {}",  dao.insert(new Person(10004, "Shubham", "Gujrat", new Date())));
		// logger.info("\nUpdate new User -> {}",  dao.update(new Person(10002, "Saurabh", "Bhopal", new Date())));
	}

}
