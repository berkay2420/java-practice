package OOP2;

public class OOP2Main {
    public static  void main(String[] args){

        Dog newDog = new Dog();
        Cat newCat = new Cat();

        System.out.println(newDog.isAlive); //automatically inherits isAlive attribute
        newCat.eat();
        newCat.sound();

        Plant newPlant = new Plant();
        newPlant.phototosynthesize();
        System.out.println(newPlant.isAlive);

        Fish newFish  = new Fish();
        newCat.move();
        newDog.move();
        newFish.move();

    }

}
