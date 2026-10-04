/*14. Write a Java program to create a `Student` class and create three different objects to store and display the details of three students.*/

class Students{
    String name;
    int roll;
    String branch;

    void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(branch);
        System.out.println();
    }

    public static void main(String[] args) {
        Students st1 = new Students();
        st1.name = "Dhanish Kumar";
        st1.roll = 56;
        st1.branch = "COMPUTER SCINCE and ENGINEERING";
        Students st2 = new Students();
        st2.name = "Shubham Sharma";
        st2.roll = 57;
        st2.branch = "COMPUTER SCINCE and ENGINEERING";
        Students st3 = new Students();
        st3.name = "Krishna Sharma";
        st3.roll = 48;
        st3.branch = "COMPUTER SCINCE and ENGINEERING";

        st1.display();
        st2.display();
        st3.display();

    }
}