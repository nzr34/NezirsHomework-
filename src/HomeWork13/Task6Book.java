package HomeWork13;

public class Task6Book {
    String bookName;
    String author;
    double price;
    boolean ebook;

    Task6Book(String cBookName, String cAuthor, double cPrice) {
        bookName = cBookName;
        author = cAuthor;
        price = cPrice;
    }

    Task6Book(String cBookName, String cAuthor, double cPrice, boolean cEBook) {
        bookName = cBookName;
        author = cAuthor;
        price = cPrice;
        ebook = cEBook;
    }

    public void displayInfo() {
        System.out.println("Title of the book:" + bookName);
        System.out.println("Author:" + author);
        System.out.println("Price:" + price);
        System.out.println("Ebook Available:" + ebook);

    }

    public static void main(String[] args) {
        Task6Book newBook1 = new Task6Book("Hunger Games", "Suzanne Collins", 13.99);
        Task6Book newBook2 = new Task6Book("Hunger Games 2", "Suzanne Collins", 15.99, true);

        newBook1.displayInfo();

        System.out.println("<><><><><><><><><><><><>");

        newBook2.displayInfo();
    }

}
