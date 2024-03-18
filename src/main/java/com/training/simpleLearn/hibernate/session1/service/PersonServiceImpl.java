package com.training.simpleLearn.hibernate.session1.service;

import com.training.simpleLearn.hibernate.session1.dao.PersonDao;
import com.training.simpleLearn.hibernate.session1.model.Car;
import com.training.simpleLearn.hibernate.session1.model.Person;
import com.training.simpleLearn.hibernate.session1.viewmodel.PersonViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonDao personDao;

    public void insertPerson(PersonViewModel personViewModel) {
        Car personCarObject = new Car(personViewModel.getCarViewModel().getModel(), personViewModel.getCarViewModel().getDate());
        Person person = new Person(personViewModel.getFirstName(), personViewModel.getLastName(), personCarObject);
        personDao.save(person);
    }

    public Optional<Person> loadById(int id) {
        return personDao.findById(Long.valueOf(id));
    }

    public List<Person> findPersonByFirstName(String name) {
        List<Person> personList = personDao.findPersonByFirstName(name);
        return personList;
    }

    public List<Person> findPersonWithCarByFirstNameAndCarId(String name, int carId) {
        List<Person> personList = personDao.findPersonWithCarByFirstNameAndCarId(name, carId);
        return personList;
    }

}
