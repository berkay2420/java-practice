import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsMain {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean continueGame = true;

        while(continueGame){
            System.out.print("Enter your move (rock,paper,scissors): ");
            String userChoice = sc.nextLine();
            String computerMove = computerMove();
            String winner = findWinner(userChoice,computerMove );
            if(winner.equals(userChoice)){
                System.out.print("You Win");
            } else if (winner.equals(computerMove)){
                System.out.println("Computer Wins");
            }else{
                System.out.println("DRAW");
            }
            continueGame = continueGame();
        }
    }
    static String computerMove(){
        Random rand = new Random();
        int n = rand.nextInt(3);
        String[] toolsArray = {"rock","paper","scissors"};
        System.out.print("Computer Choose:" + toolsArray[n]);
        return toolsArray[n];
    }
    static boolean continueGame(){
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Play Again (yes/no): ");
        String input = sc2.nextLine();
        if(input.equals("yes")){
            return true;
        }else {
            System.out.println("Game Finished");
            return false;
        }
    }
    static String findWinner(String p1, String p2){
        String winner = "";

        if(p1.equals("rock") && p2.equals("paper")){
            winner = p2;
        }else if (p1.equals("rock") && p2.equals("scissors")) {
            winner = p1;
        }else if (p1.equals("scissors") && p2.equals("paper")) {
            winner = p1;
        }else if (p1.equals("scissors") && p2.equals("rock")) {
            winner = p2;
        }else if (p1.equals("paper") && p2.equals("scissors")) {
            winner = p2;
        }else if (p1.equals("paper") && p2.equals("rock")) {
            winner = p1;
        }else if(p1.equals(p2)){
            winner = "draw";
        }
        return winner;
    }
}
