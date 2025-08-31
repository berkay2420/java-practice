package OOP;

public class Car {

    //Cars attribures
    String make;
    String model;
    int year;
    double price;
    boolean isWorking;

    Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
        this.isWorking = true;

    }
    //These methods are not static because they're instance methods
    //But if a method belong to the class itself than it's a static method
    //This means those methods can called without creating object
    void start(){
        isWorking = true;
        System.out.println("Engine Started");
    }
    void stop(){
        isWorking = false;
        System.out.println("Engine Stopped");
    }

    void drive(){
        System.out.println("You are now driving " + model);
    }
    public static  Car createCar(String make, String model, int year, double price){
        return new Car(make, model, year, price);
    }

    //.toString() = This method inherited from the Object class
    //              Used to return a string representation of an object
    //              By default it returns a hash code (a unique identifier)
    //              It can be overriden to provide meaningful details.
    @Override
    public String toString(){
        return this.make + " " + this.model + " "
                + this.year + " " + this.price + " "
                + (this.isWorking ? "Working" : "Not Working");
    }



}


