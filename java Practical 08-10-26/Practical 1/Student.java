public class Student {
    int rollNo;
    String name;
    double marks;

    Student() {
        rollNo = 56;
        name = "Dhanish kumar";
        marks = 89.9;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.display();
    }

}
