package Concepts;
import java.util.Scanner;

public class Main {
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

        System.out.println("*********************** Inheritance ***********************");
        carOne.printCarDetails();

        // encapsulation practice code with Person class
        Person personOne = new Person();

        // with our modifiers getters and setters methods, we can access and manipulate private data
        personOne.setAge(16);
        personOne.setName("Jack");
        System.out.println("*********************** Encapsulation ***********************");
        personOne.printDetails();
    }
}
