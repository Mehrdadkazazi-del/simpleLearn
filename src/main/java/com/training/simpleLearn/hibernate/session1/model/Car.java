package com.training.simpleLearn.hibernate.session1.model;

import jakarta.persistence.*;

@Table(name = "Car")
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    private String model;

    private Long date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Car() {
    }

    public Car(String model, Long date) {
        this.model = model;
        this.date = date;
    }
}
