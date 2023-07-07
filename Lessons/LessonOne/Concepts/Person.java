package Concepts;
class Person {

    private String Name;
    private int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name){
        this.Name = name;
    }

    public void setAge(int age){
        this.Age = age;
    }

    public int getAge() {
        return Age;
    }

    // or create a getter method to print all the details from an object
    public void printDetails() {
        System.out.println("My name is: " + this.Name + " and I am " + this.Age + " years old.");
    }
    
}

