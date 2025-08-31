package JavaAbstraction;

public  abstract class Shape {

    //This class is an abstract class. This means we can't create
    // objects directly from this class.

    //An abstract method must be implemented by it's children
    abstract double area();

    //Concrete method
    //This can be called directly. It's the opposite of abstract methods
    void display(){
        System.out.println("This is a shape");
    }
}
