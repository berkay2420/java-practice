import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args){

        Scanner newScanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String verb1;
        String adjective2;
        String adjective3;

        System.out.println("Enter an adjective");
        adjective1 = newScanner.nextLine();

        System.out.println("Enter a noun");
        noun1 = newScanner.nextLine();

        System.out.println("Enter an adjective ");
        adjective2 = newScanner.nextLine();

        System.out.println("Enter an action");
        verb1 = newScanner.nextLine();

        System.out.println("Enter an adjective");
        adjective3 = newScanner.nextLine();


        System.out.println("Today I went to a " + adjective1 + "zoo");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3);

        newScanner.close();
    }
}
