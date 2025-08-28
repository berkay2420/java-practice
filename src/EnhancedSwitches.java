import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        String userInput;
        System.out.println("Write the day: ");
        userInput = sc.nextLine().toLowerCase();

        switch(userInput){
            case "monday","tuesday","wednesday","thursday","friday" -> System.out.println("Its a weekday");
            case"saturday","sunday" -> System.out.println("Its weekend");
            default -> System.out.println("not a valid day");
        }
    }
}
