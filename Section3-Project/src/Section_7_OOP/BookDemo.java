package Section_7_OOP;

public class BookDemo {
    public static void main(String[] args) {

        Book somethingBook = new Book("Someone","somethingBook", "strange",150);
        Book mathsBook = new Book("MrMathsSomeone","mathsSomethingBook", "mathsStrange",314);

        somethingBook.printBookDetails();
        mathsBook.printBookDetails();

    }
    public static void printBooks(Book book){

    }
}
