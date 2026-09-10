public class Condition {
    String studentName = "Dhanish Kumar";
    int rollNo = 56;
    static String collegeName = "SEEMANTA ENGINEERING COLLEGE";

    void subjectMarks(int sub1, int sub2, int sub3){
        int total = sub1 + sub2 + sub3;
        double percentage = (total/300.0) * 100;

        System.out.println("College name: " + collegeName);
        System.out.println("Student name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 40.0) {
            System.out.println("Result: PASS");
        }else{
            System.out.println("Result: FAIL");
        }
    }

    public static void main(String[] args) {
        Condition display = new Condition();
        display.subjectMarks(85, 65, 39);
    }
}
