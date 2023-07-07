package Concepts;

import java.util.Scanner;

class Vehicle {
    protected String brand;
    protected String colour;
    protected int maxSpeed = 120;

    protected void honk() {
        System.out.println("Beep beep!");
    }
}

class Car extends Vehicle {
    private String modelName;

    Car() {
        this.modelName = "Model name not specified";
        this.brand = "Brand name not specified";
        this.colour = "Car colour not specified";
    }

    public Car(String modelName, String brand, String colour) {
        this.modelName = modelName;
        this.brand = brand;
        this.colour = colour;
    }

    void printCarDetails() {
        System.out.println("My model name is: " + this.modelName + "!\n" +
                "Colour is: " + this.colour + "\nbrand name is: " + this.brand);
        this.honk();
        System.out.println("Max speed is: " + super.maxSpeed);
    }
}

