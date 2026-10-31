import java.util.*;

public class Library {
    private List<Book> books;
    private int nextId = 1;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        books.add(new Book(nextId++, title, author));
        System.out.println("Book added successfully.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(int id, String customerName, String phoneNumber, String dueDate) {
        for (Book book : books) {
            if (book.getId() == id && !book.isIssued()) {
                book.issue(customerName, phoneNumber, dueDate);

                System.out.println("Book issued successfully.");

                System.out.println("SMS Sent to " + phoneNumber);
                System.out.println("Book: Issued Successfully");
                System.out.println("Return Date: " + dueDate);
                return;
            }
        }

        System.out.println("Book not found or already issued.");
    }

    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("Book not found or not issued.");
    }
}