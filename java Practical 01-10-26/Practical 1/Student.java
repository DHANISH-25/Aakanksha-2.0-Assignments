import java.util.Scanner;

class Student {

    int roll;
    String studentName;

    public void studentDetails(int rollNo, String name) {

        roll = rollNo;
        studentName = name;
        System.out.println("Student Roll no.: " + rollNo);
        System.out.println("Student Name: " + name);

    }

    public static void main(String[] args) {

        Student obj = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rollNo: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        obj.studentDetails(rollNo, name);
        sc.close();
    }
}
