package JavaAbstraction;

public class JavaABSMain {

    public static void main(String[] args){

        //It's not possible to create a object from abstract class
        //But it's possible to create objects from inherited classes using abstract class
        Shape newCircle = new Circle(3);
        Shape newRectangle = new Rectangle(10,20);
        Shape newTriangle = new Triangle(3,10);
        //This is called polymorphism
        //is useful when trying to create a array of objects
        //We can create an array of shapes and add all these objects to the array
        //Shape[] shape = {newCircle, newRectangle, newTriangle);
        //This works in interfaces also

        newCircle.display();
        System.out.println(newCircle.area());
        System.out.println(newTriangle.area());
        System.out.println(newRectangle.area());
    }

}
