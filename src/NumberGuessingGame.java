import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int n = rand.nextInt(min,max + 1);
        int userGuess;
        int attemps = 1;

        System.out.println("Number Guessing Game");

        System.out.printf("Guess a number between %d-%d: ",min,max);
        userGuess = sc.nextInt();

        while(userGuess != n ){
            attemps++;
            String higherLower = (userGuess > n) ? "TOO HIGH" : "TOO LOW";
            System.out.printf("%s TRY AGAIN!\n",higherLower);
            System.out.printf("Guess a number between %d-%d: ",min,max);
            userGuess = sc.nextInt();
        }
        System.out.printf("You have guessed it correctly after %d attempts",attemps );
    }
}
