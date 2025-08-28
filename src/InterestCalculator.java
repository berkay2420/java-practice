import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double principal;
        int interestRate;
        double compoundPerYear;
        int years;
        double totalReturn;

        System.out.print("Enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        interestRate = sc.nextInt() / 100;

        System.out.print("Enter the number of times compound per year: ");
        compoundPerYear = sc.nextDouble();

        System.out.print("Enter the number of years: ");
        years = sc.nextInt();

        totalReturn = principal * Math.pow(1 + interestRate / compoundPerYear, compoundPerYear * years);

        System.out.printf("The amount after %d years is %.2f", years, totalReturn);
        sc.close();



    }
}
