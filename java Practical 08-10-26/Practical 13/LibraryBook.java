public class LibraryBook {
    int bookId;
    String title;
    String author;
    boolean available;

    LibraryBook(int bi, String t, String a, boolean av){
        bookId = bi;
        title = t;
        author = a;
        available = av;
    }
    LibraryBook(int bi, String t, String a){
        bookId = bi;
        title = t;
        author = a;
    }
    LibraryBook(int bi, String t){
        bookId = bi;
        title = t;
    }

    void issueBook(){
        if (available) {
            available = false;
            System.out.println("Book issued.");
        }else
            System.out.println("Book not available now.");
    }

    void returnBok(){
        if (!available) {
            available = true;
            System.out.println("Book returned");
        }else
            System.out.println("Book is already available");
    }

    void display(){
        System.out.println("Book Id: " + bookId + " Title: " + title + " author: " + author + " availablibility: " + available);
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook(5551, "java", "james", true);
        LibraryBook lb1 = new LibraryBook(5551, "java", "james");
        LibraryBook lb2 = new LibraryBook(5551, "java");
        lb.display();
        lb1.display();
        lb2.display();

        lb.issueBook();
        lb.returnBok();
    }


}
