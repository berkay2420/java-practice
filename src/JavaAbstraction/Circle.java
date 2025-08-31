package JavaAbstraction;

public class Circle extends Shape {

    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    //Like other children circle have to implement abstract methods
    @Override
    double area(){
        return Math.PI * this.radius * this.radius;
    }
}
