package JavaSuper;

public class JavaSuperMain {

    public static void main(String[] args){
        //super = Refers to the parent class(subclass <- superclass)
        //Used in constructors and method overriding
        //Calls the parent clas to initialize attributes
        Person person = new Person("Bob", "Tolk");
        person.showName();

        Student newStudent = new Student("John","Jackson",3.24);
        newStudent.showName();
        newStudent.showGPA();

        Employee newEmployee = new Employee("Tim","Burton",20000);
        newEmployee.showSalary();
        newEmployee.showName();
    }

}
