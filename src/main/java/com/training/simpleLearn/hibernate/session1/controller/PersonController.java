package com.training.simpleLearn.hibernate.session1.controller;

import com.training.simpleLearn.hibernate.session1.model.Person;
import com.training.simpleLearn.hibernate.session1.service.PersonService;
import com.training.simpleLearn.hibernate.session1.viewmodel.PersonViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping("/save")
    public void save(@RequestBody PersonViewModel personViewModel) {
        personService.insertPerson(personViewModel);
    }

    @GetMapping("loadById")
    public Optional<Person> loadById(@RequestParam(value = "id", required = true) int id) {
        return personService.loadById(id);
    }

    @GetMapping("findPersonByFirstName")
    public List<Person> findPersonByFirstName(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "id", required = false) int id) {
        return personService.findPersonByFirstName(name);
    }

    @GetMapping("findPersonByFirstName")
    public List<Person> findPersonWithCarByFirstNameAndCarId(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "carId", required = false) int carId) {
        return personService.findPersonWithCarByFirstNameAndCarId(name, carId);
    }
}
