package OOP;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    //Constructor
    //Setting up initial values
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa  = gpa;
        this.isEnrolled = true; //automatically enrolled when created
    }

    void study(){
        System.out.println(this.name + " is studying");
        //the object we passed is doing something
    }
}
