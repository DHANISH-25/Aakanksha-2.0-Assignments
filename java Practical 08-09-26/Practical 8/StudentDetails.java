public class StudentDetails {
    static String collegeName = "SEEMANTA ENGINEERING COLLEGE";
    String studentName = "Dhanish kumar";

    void subjectMarks(int math, int chemistry, int physics){
        int totalMarks = math + chemistry + physics;
        System.out.println("student Name: " + studentName);
        System.out.println("college name : " + collegeName);
        System.out.println("Total marks of math, physics and science is: " + totalMarks);
    }

    public static void main(String[] args) {
        StudentDetails marks = new StudentDetails();
        marks.subjectMarks(76,85,68);
    }
}
