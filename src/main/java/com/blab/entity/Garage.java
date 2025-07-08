package com.blab.entity;

import java.util.ArrayList;

public class Garage {

    // list to store multiple car objects
    private ArrayList<Car> cars;

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
