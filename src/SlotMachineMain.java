import java.util.Random;
import java.util.Scanner;

public class SlotMachineMain {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int balance = 50;
        boolean continueGame = true;

        welcomeMessage();
        System.out.println("Current Balance: $" + balance);

        while(continueGame){
            balance = playGame(balance);
            System.out.println("Current Balance: $" + balance);
            continueGame = continueGame();

        }
    }


    static int playGame(int balance){
        int bet = askBet(balance);
        int afterSpin = spin(bet);
        if (afterSpin == 0){
            return balance - bet;
        } else {
            return  balance +  spin(bet);
        }

    }

    static int askBet(int balance){
        boolean isAcceptable = false;
        int bet = 0;
        while(!isAcceptable){
            System.out.println("How much do you want to bet?");
            bet = sc.nextInt();
            sc.nextLine();
            if(checkBalance(balance, bet)){
                isAcceptable = true;
            }else{
                System.out.println("Please Provide Correct amount for bet");
            }
        }
        return bet;
    }

    static void welcomeMessage(){
        System.out.println("**********************************");
        System.out.println("WELCOME TO THE JAVA SLOT MACHINE GAME");
        System.out.println("Symbols: " +
                "\uD83E\uDD9A,\uD83E\uDD8D, \uD83E\uDD95, \uD83E\uDD9E, \uD83E\uDD84");
        System.out.println("PLACE BET TO PLAY THE GAME");
        System.out.println("**********************************");
    }

    static boolean checkBalance(int balance, int bet){
        System.out.println("Checking Balance");
        if(balance > bet && bet != 0){
            return true;
        } else if (balance < bet){
            System.out.println("You can't bet more than your balance");
            return false;
        } else if (bet == 0) {
            System.out.println("Bet must be more than 0");
            return false;
        }else {
            return false;
        }
    }

    static int spin(int betAmount){
        int sameSlots= 0;
        int totalReturn = 0;
        String[] slots = {"\uD83E\uDD9A","\uD83E\uDD8D", "\uD83E\uDD95","\uD83E\uDD9E", "\uD83E\uDD84"};
        Random rand = new Random();
        int slot1 = rand.nextInt(slots.length);
        int slot2 = rand.nextInt(slots.length);
        int slot3 = rand.nextInt(slots.length);


        System.out.println("****************");
        System.out.print(slots[slot1] + "|" +slots[slot2] + "|" + slots[slot3] + "|\n" );
        System.out.println("****************");

        if (slots[slot1].equals(slots[slot2])) {
            sameSlots++;
            if(slots[slot1].equals(slots[slot3])){
                sameSlots++;
            }else if(slots[slot2].equals(slots[slot3])) {
                sameSlots++;
            }
        }else if (slots[slot1].equals(slots[slot3])) {
            sameSlots++;
                if (slots[slot2].equals(slots[slot3])){
                    sameSlots++;
                }
        }else if(slots[slot2].equals(slots[slot3])){
            sameSlots++;
        }

        totalReturn = betAmount * (sameSlots + 1);

        if (sameSlots == 0){
            System.out.println("Sorry you have lost this round");
            return 0;
        }else {
            System.out.printf("Congratulations you have %d same slots\n",sameSlots + 1);
            System.out.printf("You have won: $" + betAmount * sameSlots);
            return  totalReturn;
        }



    }

    static boolean continueGame(){
        System.out.print("Would you like to continue game? (yes/no): ");
        String userAnswer = sc.nextLine();

        if (userAnswer.equals("yes")){
            return true;
        } else {
            System.out.println("Game Ended");
            return false;
        }
    }

}
