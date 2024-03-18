package com.training.simpleLearn.hibernate.session1.viewmodel;

public class PersonViewModel {
    private int id;
    private String firstName;
    private String lastName;

    private CarViewModel carViewModel;

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

    public CarViewModel getCarViewModel() {
        return carViewModel;
    }

    public void setCarViewModel(CarViewModel carViewModel) {
        this.carViewModel = carViewModel;
    }
}
