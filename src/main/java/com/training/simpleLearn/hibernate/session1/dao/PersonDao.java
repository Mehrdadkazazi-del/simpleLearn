package com.training.simpleLearn.hibernate.session1.dao;

import com.training.simpleLearn.hibernate.session1.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao extends JpaRepository<Person, Long> {

    @Query("from Person ent where ent.firstName like :firstName")
    List<Person> findPersonByFirstName(@Param("firstName") String firstName);

    @Query("from Person person left join fetch Car car on person.personCarId=car.id where person.firstName like :firstName")
    List<Person> findPersonWithCarByFirstNameAndCarId(@Param("firstName") String firstName, int carId);


}
