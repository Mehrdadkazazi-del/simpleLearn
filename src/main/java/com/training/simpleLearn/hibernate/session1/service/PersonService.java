package com.training.simpleLearn.hibernate.session1.service;

import com.training.simpleLearn.hibernate.session1.model.Person;
import com.training.simpleLearn.hibernate.session1.viewmodel.PersonViewModel;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    void insertPerson(PersonViewModel personViewModel);

    Optional<Person> loadById(int id);

    List<Person> findPersonByFirstName(String name);

    List<Person> findPersonWithCarByFirstNameAndCarId(String name, int carId);
}
