public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    private String customerName;
    private String phoneNumber;
    private String dueDate;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;

        this.customerName = "";
        this.phoneNumber = "";
        this.dueDate = "";
    }

    public int getId() {
        return id;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issue(String customerName, String phoneNumber, String dueDate) {
        this.isIssued = true;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.dueDate = dueDate;
    }

    public void returnBook() {
        this.isIssued = false;
        this.customerName = "";
        this.phoneNumber = "";
        this.dueDate = "";
    }

    @Override
    public String toString() {
        if (isIssued) {
            return "[" + id + "] " + title + " by " + author +
                   " (Issued to " + customerName +
                   ", Phone: " + phoneNumber +
                   ", Due: " + dueDate + ")";
        } else {
            return "[" + id + "] " + title + " by " + author;
        }
    }
}