public class Book{
    String subject = "JAVA";
    String bookTitle = "Complete Reference";
    String authorName = "Kerty Syera";
    String publisherName = "Com tech";
    double price = 975.58;
    public void bookDetails(){
        System.out.println("The book subject Name: " + subject);
        System.out.println("The book title: " + bookTitle);
        System.out.println("The name of the Author: " + authorName);
        System.out.println("The name of the Publisher: " + publisherName);
        System.out.println("Book Price: " + price);
    }

    public static void main(String[] args) {
        Book obj = new Book();
        obj.bookDetails();
    }
}