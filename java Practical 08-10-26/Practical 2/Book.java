public class Book {
    int bookId;
    String title;
    String author;

    Book(int bi, String t, String a) {
        bookId = bi;
        title = t;
        author = a;
    }

    void display() {
        System.out.println("Book Id: " + bookId);
        System.out.println("Book title: " + title);
        System.out.println("Book Author: " + author);
    }

    public static void main(String[] args) {
        Book bk = new Book(450065, "Java", "james");
        bk.display();
    }
}
