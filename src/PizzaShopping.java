import java.util.Scanner;

public class PizzaShopping {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String product;
        double price;
        int quantity;
        double total;

        System.out.print("Which item do you want to buy?: ");
        product = scanner.nextLine();

        System.out.print("What is th price for each: ");
        price = Double.parseDouble(scanner.nextLine()); //scanner.nextDouble();

        System.out.print("How many do you want to buy: ");
        quantity = Integer.parseInt(scanner.nextLine()); //scanner.nextInt();

        total = quantity * price;
        System.out.println("You have bought " + quantity + " " +product+"s");
        System.out.println("Your total is " + total + "USD");
        scanner.close();
    }
}
