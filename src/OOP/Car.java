package OOP;

public class Car {

    //Cars attributes
    public String make;
    public String model;
    public String color;
    public int year;
    public double price;
    public boolean isWorking;
    //If we add "private we can't change or access the attributes
    //Trying to display car.make or trying to change car.price = 9000 would give an error
    //Therefore we need getters(that make a field readable)
    // and setter(that make a field writeable) methods

    Car(String make, String model, String color, int year, double price){
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
        this.isWorking = true;

    }
    //Getters
    String getMake(){
        return this.make;
    }
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    int  getYear(){
        return this.year;
    }
    String getPrice(){
        //with get methods we can change the return datatype for displaying
        return "$" + this.price;
    }
    boolean getIsWorking(){
        return this.isWorking;
    }

    //Setters
    //While defining attributes we can make some attributes changeable and some attributes unchangeable
    //In this example we can make the color and price attribute changeable and nothing more
    void setColor(String color){
        this.color = color;
    }
    void setPrice(double price){
        if (price < 0){
            System.out.println("Price must be more than zero");
        }
        else {
            this.price = price;
        }
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
    public static  Car createCar(String make, String model, String color, int year, double price){
        return new Car(make, model, color, year, price);
    }

    //.toString() = This method inherited from the Object class
    //              Used to return a string representation of an object
    //              By default it returns a hash code (a unique identifier)
    //              It can be overriden to provide meaningful details.
    @Override
    public String toString(){
        return this.make + " " + this.model + " " + this.color + " "
                + this.year + " " + this.price + " "
                + (this.isWorking ? "Working" : "Not Working");
    }



}


