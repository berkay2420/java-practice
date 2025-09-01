package OOP;

public class OOPMain {
    public static void main(String[] args){
        // Object = An entity that holds data (attributes),
        //and can perform actions (methods). It's a reference data type

        //Creating new object with "static factory method"
        Car newCar = Car.createCar("toyoya","SUV","Blue",2020, 90.800);
        System.out.println(newCar.getModel());
        newCar.setColor("Updated Blue");
        newCar.setPrice(90000);
        newCar.drive();

        //Creating new object with direct constructor
        Car newCar2 = new Car("ford","mustang","Red", 2021, 91.800);
        System.out.println(newCar2.getModel());
        newCar2.drive();

        Student newStudent = new Student("Bob",20,3.21);
        System.out.println(newStudent.name);

        newStudent.study();

        Friends friend1 = new Friends("Bob");
        System.out.println(friend1.numberOfFriends);
        Friends friend2 = new Friends("Jon");
        System.out.println(friend1.numberOfFriends);
        System.out.println(friend2.numberOfFriends);
        //access the static via class name
        System.out.println(Friends.numberOfFriends);

        Friends.showFriend();
        friend2.showFriend();

        System.out.println(newCar.toString());
    }
}
