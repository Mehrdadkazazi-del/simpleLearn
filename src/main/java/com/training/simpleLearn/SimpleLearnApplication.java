package com.training.simpleLearn;

import com.training.simpleLearn.hibernate.session1.PersonService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleLearnApplication {

	@Autowired
	PersonService personService;
	public static void main(String[] args) {
		SpringApplication.run(SimpleLearnApplication.class, args);
	}

	@PostConstruct
	public void callBean() {
		personService.insertPerson();
	}

}
