package JavaPolymorphism;

import java.util.Scanner;

public class JavaPolymorphismMain {
    public static void main(String[] args){

        //Runtime polymorphism = when the method that gets executed is decided
        // at runtime based on the actual data type of the object

        Animal animal; //We are going to assign this animal based on the input

        //Before running the program we don't know the type of animal object. Its determined in runtime
        Scanner sc = new Scanner(System.in);
        System.out.print("What kind of an animal do you want? (cat/dog): ");
        String userInput = sc.nextLine().toLowerCase();

        if (userInput.equals("cat")){
            animal = new Cat();
        } else {
            animal = new Dog();
        }

        animal.speak();

    }
}
