import java.util.Scanner;

public class SearchingArrays {
    public static void main(String[] args){

        String[] fruits = {"apple", "banana","pineapple","döner"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit to search in array: ");
        String input = sc.nextLine();

        boolean isFound = false;
        int indexNo = 0;

        while(indexNo < fruits.length){

            if(fruits[indexNo].equals(input)){
                System.out.printf("The element found at index %d ",indexNo);
                isFound = true;
                break;
            }else{
                indexNo++;
            }
        }
        if(!isFound){
            System.out.println("The item you are looking for is not in the list");
        }

    }

}

