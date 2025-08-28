public class PrintF {
    public static  void main(String[] args){
        String name = "bonb";
        char firstLetter = 'B';
        int age = 32;
        double height = 123.3;
        boolean isEmployed = false;

        System.out.printf("Hello %s\n",name);
        System.out.printf("First letter is %c\n",firstLetter);
        System.out.printf("%s is %d years old\n", name, age);

        double price1 = 9.89;

        System.out.printf("%.1f",price1);

    }
}
