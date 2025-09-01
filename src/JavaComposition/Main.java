package JavaComposition;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        Car car = new Car("FORD",2020,"v90");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type); //This is the only way to access that information

        car.engine.start();
        car.start();

        //If we delete the car object we longer access the engine object.
    }
}
