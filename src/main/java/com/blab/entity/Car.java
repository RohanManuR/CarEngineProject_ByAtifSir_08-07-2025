package com.blab.entity;

public class Car {

    // Engine type object for car
    private Engine engine;
    private String model;
    // to get private engine object
    public Engine getEngine() {
        return engine;
    }
    // setter method to insert engine object to car
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Engine is inserted into car,....");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void start()
    {
        System.out.println("car started,....");
        System.out.println("Car model : "+this.getModel());
    }
}
