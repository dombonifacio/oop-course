
package Concepts;
import java.util.Scanner;
class Vehicle {
    // What properties do all vehicles have in common?
    protected String brand;
    protected String colour;

    protected void honk(){
        System.out.println("Beep beep!");
    }
}

// use the "extends" keyword to inherit from the parent class Vehicle

class Car extends Vehicle {
    // you can specify properties what only a CAR has that other vehicles do not have.
    private String modelName;

    Car() {
        // when using "this" keyword, it refers to that specific object. carOne = new Car(); it's like saying carOne.modelName
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
        System.out.println("My model name is: " + this.modelName + "!\n" + "Colour is: " + this.colour + "\nbrand name is: " + this.brand);
        // you can also call out the parent's class method here
        this.honk();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I am inside the main function!");

        System.out.println("Enter car model: ");
        String carModel = input.nextLine();
        System.out.println("Enter car colour: ");
        String carColour = input.nextLine();
        System.out.println("Enter brand name: ");
        String carBrand = input.nextLine();
        Car carOne = new Car(carModel, carColour, carBrand);
        
        carOne.printCarDetails();
    }
}
