import java.util.Scanner;

public class BankingProgram {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int userInput = 0;
        double balance = 100;

        do{
            userInput = bringMenu();
            balance = programLogic(userInput, balance);
        }while(userInput != 4);

        System.out.println("Program Ended");

    }

    static double programLogic(int userInput, double balance){

        switch (userInput){
            case 1 ->{
                System.out.println("****************************************");
                System.out.printf("Your Balance is %.2f USD\n", balance);
                System.out.println("****************************************");
            }
            case 2 ->{
                System.out.println("Enter the amount: ");
                double depositAmount = sc.nextDouble();
                balance += depositAmount;
                System.out.println("Balance updated\n");
            }
            case 3 ->{
                System.out.println("Enter the amount: ");
                double withdrawAmount = sc.nextDouble();
                if(checkBalance(balance, withdrawAmount)){
                    balance -= withdrawAmount;
                    System.out.println("Balance updated\n");
                }else {
                    System.out.println("Current balance not enough. Choose another action");
                }
            }
        }
        return balance;
    }

    static boolean checkBalance(double balance, double amount){
        return amount < balance;
    }

    static int bringMenu(){
        int choice;
        System.out.println("****************************************");
        System.out.println("BANKING PROGRAM");
        System.out.println("****************************************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("****************************************");
        System.out.println("Enter Your Choice 1-4: ");
        choice = sc.nextInt();
        return choice;
    }
}
