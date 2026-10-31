public class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book(1, "Java Programming", "James Gosling");

        System.out.println(b1);

        b1.issue("Rakshitha", "9876543210", "10-05-2026");
        System.out.println("After issuing: " + b1);

        b1.returnBook();
        System.out.println("After returning: " + b1);
    }
}
