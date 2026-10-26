public class LibraryBook {
    private String bookName;
    private boolean issued;

    public LibraryBook(String bookName) {
        setBookName(bookName);
        this.issued = false;
    }

    public void setBookName(String bookName) {
        if (bookName != null && !bookName.isEmpty()) {
            this.bookName = bookName;
        } else {
            System.out.println("Invalid Book Name!");
        }
    }

    public String getBookName() {
        return bookName;
    }

    public boolean isIssued() {
        return issued;
    }

    public void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println(bookName + " has been issued.");
        } else {
            System.out.println(bookName + " is already issued.");
        }
    }

    public void returnBook() {
        if (issued) {
            issued = false;
            System.out.println(bookName + " has been returned.");
        } else {
            System.out.println(bookName + " is already available.");
        }
    }

    public void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Status: " + (issued ? "Issued" : "Available"));
    }

    public static void main(String[] args) {

        LibraryBook b1 = new LibraryBook("Java Programming");

        b1.display();

        b1.issueBook();
        b1.display();

        b1.returnBook();
        b1.display();
    }
}
