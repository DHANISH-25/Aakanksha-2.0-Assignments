import java.util.Scanner;

public class Studentt {
    double totalMarks;

    public void total(double sub1Marks, double sub2Marks, double sub3Marks) {
        totalMarks = sub1Marks + sub2Marks + sub3Marks;
        System.out.println("Total marks: " + totalMarks);
    }

    void average(double sub1Marks, double sub2Marks, double sub3Marks) {
        double avg = this.totalMarks / 3;
        System.out.printf("Average: %.2f%%\n", avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your subject 1 marks: ");
        double sub1Marks = sc.nextDouble();
        System.out.println("Enter your suject 2 marks: ");
        double sub2Marks = sc.nextDouble();
        System.out.println("Enter your subject 3 marks: ");
        double sub3Marks = sc.nextDouble();

        Studentt obj = new Studentt();
        obj.total(sub1Marks, sub2Marks, sub3Marks);
        obj.average(sub1Marks, sub2Marks, sub3Marks);

        sc.close();
    }
}