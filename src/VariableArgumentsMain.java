public class VariableArgumentsMain {
    public static void main(String[] args){
        System.out.println(addNumbers(1,2,3,4));
    }

    static int addNumbers(int... numbers){
        int sum=0;
        for (int number : numbers){
            sum+=number;
        }
        return sum;
    }
}
