import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();

                    library.addBook(title, author);
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    System.out.print("Enter book ID to issue: ");
                    int issueId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter customer name: ");
                    String customerName = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phoneNumber = sc.nextLine();

                    System.out.print("Enter due date: ");
                    String dueDate = sc.nextLine();

                    library.issueBook(issueId, customerName, phoneNumber, dueDate);
                    break;

                case 4:
                    System.out.print("Enter book ID to return: ");
                    int returnId = sc.nextInt();
                    sc.nextLine();

                    library.returnBook(returnId);
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
        System.out.println("Exiting Library Management System.");
    }
}
