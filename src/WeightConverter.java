import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userChoice;
        double mainWeight;
        double convertedWeight;

        System.out.println("Welcome to the Weight Converter");
        System.out.println("(1) Convert lbs to kgs");
        System.out.println("(2) Convert kgs to lbs");
        System.out.print("Choose an option 1/2: ");
        userChoice = sc.nextInt();

        if (userChoice == 1){
            System.out.print("Enter the weight in lbs: ");
            mainWeight = sc.nextDouble();
            convertedWeight = mainWeight* 0.45359237;
            System.out.printf("%.2f lbs is %.2f kgs", mainWeight,convertedWeight);
        } else {
            System.out.print("Enter the weight in kgs: ");
            mainWeight = sc.nextDouble();
            convertedWeight = mainWeight* 2.2046;
            System.out.printf("%.2f kg is %.2f lbs", mainWeight,convertedWeight);
        }
        sc.close();

    }
}
