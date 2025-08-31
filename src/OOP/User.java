package OOP;

public class User {
    String userName;
    String email;
    int age;

    //It's possible to create more than 1 constructor with the same name
    //But their parameters must be different
    //This is called overloaded constructors
    User(){
        this.userName = "Guest";
        this.email = "guest@guest.com";
    }

    //if just userName provided
    User(String userName){
        this.userName = userName;
        this.email = "not provided";
    }
}
