package com.blab.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Garage garage = (Garage)context.getBean("garage");
        for(Car car : garage.getCars())
        {
            car.start();
        }
    }
}