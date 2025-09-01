package JavaInterface;

public class JavaInterfaceMain {
    public static void main(String[] args){

        Rabbit newRabbit = new Rabbit();
        newRabbit.flee();

        Hawk newHawk = new Hawk();
        newHawk.hunt();

        //One of the main difference between interface and abstraction is
        //a class can implement more than one interfaces.
        //In the below example fish implements predator and the prey at the same time
        Fish newFish = new Fish();
        newFish.flee();
        newFish.hunt();
    }

}
