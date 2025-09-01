package JavaComposition;

public class Engine {
    String type;
    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.printf("You have started the %S engine\n", type);
    }
}
