package com.blab.entity;

public class Car {

    // Engine type object for car
    private Engine engine;

    // Object through constructor
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Engine is inserted to the car,...");
    }

    public void start()
    {
        System.out.println("car started,....");
    }
}
