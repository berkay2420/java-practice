import java.util.Scanner;
public class MathClass {
    public static void main(String[] args){
        double edge1;
        double edge2;
        double hypotenuse;

        Scanner sc = new Scanner(System.in);
        System.out.print("Edge 1:");
        edge1 = sc.nextDouble();
        System.out.print("Edge 2: ");
        edge2 = sc.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(edge1,2) + Math.pow(edge2,2));
        System.out.println("Hypotenuse is " +hypotenuse);
    }
}
