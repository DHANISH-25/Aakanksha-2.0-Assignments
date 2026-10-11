/*
17. Create a `Student` class with `rollNo`, `name`, `course`, and `marks`, and implement a **default constructor, parameterized constructor, 
and copy constructor**. Create one student object, create another object by copying the first object, modify the copied student's marks, and 
demonstrate that both objects are independent. */

public class Students {
    int rollNo;
    String name;
    String course;
    double marks;

    Students(){
        rollNo = 56;
        name = "Dhanish kumar";
        course = "java";
        marks = 89.5;
    }

    Students(int r, String n, String c, double m){
        rollNo = r;
        name = n;
        course = c;
        marks = m;
    }

    Students(Students c){
        this.rollNo = c.rollNo;
        this.name = c.name;
        this.course = c.course;
        this.marks = c.marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Students st = new Students(57, "Shubham sharma", "JAVA", 87.6);
        Students st1 = new Students(st);
        st1.marks = 91.5;

        System.out.println("Original Student:");
        st.display();

        System.out.println("Copied Student:");
        st1.display();
    }
    
}