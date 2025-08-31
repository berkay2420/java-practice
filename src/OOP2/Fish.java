package OOP2;

public class Fish extends Animal {
    //override means a subclass offers it's own implementation of a method
    @Override
    void move(){
        System.out.println("This animal is swimming");
        //The animal class already have a move method but fish moves differently
        //so we have overriden the move method and created a new move method for fish
    }
}
