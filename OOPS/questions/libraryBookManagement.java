// Create a Book class and a Library class. Store book ID, title, borrower name, and days borrowed.
// Reject invalid book IDs. Display overdue books borrowed for more than 14 days and calculate
// overdue fines.

import java.util.Scanner;

class Book {

    private String bookID;
    private String title;
    private String bName;
    private int days;

    // working as setters
    Book(String bookID, String title, String bName, int days) {
        this.bookID = bookID;
        this.title = title;
        this.bName = bName;
        this.days = days;
    }

    // getters
    public void display() {
        System.out.println("Book ID = " + this.bookID);
        System.out.println("Book Title = " + this.title);
        System.out.println("Book Borrower = " + this.bName);
        System.out.println("Days Borrowed = " + this.days);
    }
}

class Library {

    public static boolean helper(String bookID) {
        if (bookID == null) {
            return false;
        }
        bookID = bookID.trim();

        if (bookID.isEmpty() || bookID.contains(" ")) {
            return false;
        }
        return bookID.matches("[A-Za-z0-9]+");
    }

    public static int overdueFine(int days) {
        if (days < 0) {
            return -1;
        }
        if (days > 14) {
            return (days - 14) * 2;
        }
        return 0;
    }
}

public class libraryBookManagement {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter Book ID: ");
        String bookID = ip.nextLine();

        System.out.println("Enter book title: ");
        String title = ip.nextLine();

        System.out.println("Enter Borrower Name: ");
        String bName = ip.nextLine();

        System.out.println("Enter days borrowed: ");
        int days = ip.nextInt();

        Book b = new Book(bookID, title, bName, days);
        b.display();

        Library l = new Library();

        if (l.helper(bookID)) {
            System.out.println("Fine due = " + l.overdueFine(days));
        } else {
            System.out.println("Enter valid book ID");
        }
    }
}
