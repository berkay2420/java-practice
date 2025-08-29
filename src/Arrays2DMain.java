import java.security.Key;

public class Arrays2DMain {
    public static void main(String[] args){
        String[] fruits = {"apple","watermalon","orange"};
        String[] foods = {"pizza","döner","taco"};
        String[] animals = {"dog","cat","cow"};

        String[][] groceries = {fruits, foods, animals};

        for(String[] things : groceries){
            for(String thing : things ){
                System.out.print(thing + " ");
            }
            System.out.println();
        }

    }
}
