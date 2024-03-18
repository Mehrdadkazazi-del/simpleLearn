package com.training.simpleLearn.hibernate.session1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car personCar;

    @Column(name = "personCar", insertable = false, updatable = false)
    private int personCarId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Car getPersonCar() {
        return personCar;
    }

    public void setPersonCar(Car personCar) {
        this.personCar = personCar;
    }

    public int getPersonCarId() {
        return personCarId;
    }

    public void setPersonCarId(int personCarId) {
        this.personCarId = personCarId;
    }

    public Person() {
    }

    public Person(String firstName, String lastName, Car personCar, int personCarId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personCar = personCar;
        this.personCarId = personCarId;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Car personCar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personCar = personCar;
    }

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
