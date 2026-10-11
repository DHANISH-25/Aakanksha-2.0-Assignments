public class Studentt {
    int rollNo;
    String name;
    String course;
    double marks;

    Studentt(int r, String n) {
        rollNo = r;
        name = n;
    }

    Studentt(int r, String n, String c) {
        rollNo = r;
        name = n;
        course = c;
    }

    Studentt(int r, String n, String c, double m) {
        rollNo = r;
        name = n;
        course = c;
        marks = m;
    }

    void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student roll No: " + rollNo);
        System.out.println("Student course: " + course);
        System.out.println("Student marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Studentt st = new Studentt(9, "Braj Gopal Das");
        Studentt st1 = new Studentt(48, "Krishna Sharma", "java");
        Studentt st2 = new Studentt(56, "Dhanish Kumar", "java", 87.5);

        st.display();
        st1.display();
        st2.display();
    }

}
