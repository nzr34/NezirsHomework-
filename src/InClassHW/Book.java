package InClassHW;

public class Book {
    String bookName;
    String author;
    double price;
    boolean ebook;

    Book(String bookName, String author, double price){
        this.bookName=bookName;
        this.author=author;
        this.price=price;
    }
    Book(String bookName, String author, double price, boolean cEBook){
        this.bookName=bookName;
        this.author=author;
        this.price=price;
        this.ebook=cEBook;
    }
    public void displayInfo(){
        System.out.println("Title of the book:"+bookName);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
        System.out.println("Ebook Available:"+ebook);

    }

    public static void main(String[] args) {
        Book newBook1=new Book("Hunger Games","Suzanne Collins",13.99);
        Book newBook2=new Book("Hunger Games 2","Suzanne Collins",15.99,true);

       newBook1.displayInfo();

        System.out.println("<><><><><><><><><><><><>");

       newBook2.displayInfo();
    }

}
