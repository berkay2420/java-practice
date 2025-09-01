package JavaAggregation;

public class Main {
    public static void main(String[] args){
        //Aggregation = Reperesents "has-a" relationship between objects
        //On object contains another object as part of its structure,
        //but the contained objects can exist independently
        //for example:
        //Engine engine = new Engine();
        //Car car = new Car(engine); //the engine attribute already defined in
        //car class and every car object needs an engine object

        //The difference between composition and aggregation is
        //in agg. objects can exist independently
        Book book1 = new Book("LOTR", 400);
        Book book2 = new Book("DUNE", 670);
        Book book3 = new Book("GOT", 1000);

        Book[] books = {book1, book2, book3};
        //aggregation
        Library library = new Library("Alexandria", 100, books);
        library.displayInfo();

    }
}
