package JavaAggregation;

public class Library {
    String name;
    int estYear;
    Book[] books;

    Library(String name, int estYear, Book[] books){
        this.name = name;
        this.estYear = estYear;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.estYear + " " + this.name);
        System.out.println("Books Available");
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
    }
}
