import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TernanyOperator {
    public static void  main(String[] args){
        //ternany operator ? = Return 1 of 2 values if a condition is true

        //variable = (condition) ? ifTrue : ifFalse;
        Random rand = new Random();
        int n = rand.nextInt();

        String studentState = (n % 2 == 0 ) ? "PASSED" : "FAILED";
        System.out.printf("Student is %s the class\n", studentState);

        Scanner sc = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the Tempature: ");
        temp = sc.nextDouble();

        System.out.print("Convert to the Celcius or Fahrenheit: ");
        unit = sc.next().toUpperCase(); //just next char

        newTemp = (unit.equals("C")) ? (temp - 32) * 5.0/9.0 : (temp * 9.0/5.0) + 32;

        System.out.printf("%.2f°%s",newTemp,unit);
        sc.close();

    }
}
