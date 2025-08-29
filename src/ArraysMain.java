import java.util.Arrays;
import java.util.Scanner;

public class ArraysMain {
    public static void main(String[] args) {

        /*String[] stringArray = {"apple", "orange", "watermelon"};

        stringArray[0] = "pineapple";
        System.out.println(stringArray[0]);

        for(int i = 0 ; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }

        //enhanced for loop
        //foreach
        for(String fruit : stringArray){
            System.out.println(fruit);
        }

        Arrays.sort(stringArray);
        Arrays.fill(stringArray, "pineapple");*/

        Scanner sc = new Scanner(System.in);

        //String[] foods = new String[userInput]; //empty array size of 3

        String[] foods;
        int size;

        System.out.print("Enter the number of foods do you want: ");
        size = sc.nextInt();
        sc.nextLine(); //cleaning the scanner buffer

        foods = new String[size];

        for(int i=0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = sc.nextLine();
        }
        for(String food: foods){
            System.out.print(food + ",");
        }

        sc.close();


    }
}
