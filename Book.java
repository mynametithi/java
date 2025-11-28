import java.lang.classfile.instruction.StackInstruction;

public class Book {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "unknown", "unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Already given");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book:");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("surely you enjoy this...leave your commitment.");
        } else {
            System.out.println("This book is already have in the library.");
        }
    }

    public static void main(String[] args) {
        Book designBook1 = new Book("1022", "The pain", "RK Narayan");
        Book designBook2 = new Book("1023", "The art", "Lila Majumder");
        Book designBook3 = new Book("1024", "Byomkesh gotro", "Satyajit Roy");
        Book designBook4 = new Book("1025", "The Moon", "John amrquet");
        System.out.println(Book.getTotalNoOfBooks());
        designBook2.borrowBook();
        designBook1.borrowBook();
        designBook1.returnBook();
        designBook1.returnBook();
    }

}