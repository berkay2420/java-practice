package JavaSuper;

public class Student extends Person {

    double gpa;

    Student(String first, String last, double gpa){

        //The Person class needs first and last parameters to start
        //we need to use "super" to give arguments to the superclass
        super(first,last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + "'s GPA is " + this.gpa);
    }

}
