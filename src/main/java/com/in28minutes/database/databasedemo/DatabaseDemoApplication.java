package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;

import jdbc.PersonJdbcDao;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("All users ->{}"+ dao.findAll());
		logger.info("user id -10001 ->{}"+ dao.findById(10001));
		logger.info("deleting -10002 ->no of rows deleted{}"+ dao.deleteById(10002));
		logger.info("Inseting id 10004 "+ dao.insert(new Person(10004, "Tara", "Berlin", new Date())));
		logger.info("Updating id 10004 "+ dao.update(new Person(10004, "Peter", "Paris", new Date())));
	}


}
