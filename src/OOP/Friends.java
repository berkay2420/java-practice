package OOP;

public class Friends {

    String name;

    //static makes a variable or method belong to the class rather than to any specific object
    //This means now every object in this class shares the same number of friends information.
    //Every objects numberOfFriends attribute going to be incremented when a new friend created
    static int numberOfFriends;

    Friends(String name){
        this.name = name;
        numberOfFriends++;
    }

    //while working with static attributes we don't need "this" keyword
    static void showFriend(){
        System.out.println("You have total of "+ numberOfFriends + " friends");
    }
}
