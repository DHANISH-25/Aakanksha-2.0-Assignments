import java.util.Scanner;

public class Students {
    String name;
    int rollNo;
    int[] marks = new int[5];
    double percentage;

    Students(String n, int r, int[] m) {
        name = n;
        rollNo = r;
        marks = m;
    }

    void percentage() {
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        percentage = total / 5;

        if (total >= 90) {
            System.out.println("Grade: A");
        } else if (total >= 80) {
            System.out.println("Grade B");
        } else if (total >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Your are fail.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your rollNo: ");
        int rollNo = sc.nextInt();
        System.out.println("Enter 5 subject marks: ");
        int marks[] = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
        Students s1 = new Students(name, rollNo, marks);
        s1.percentage();

        sc.close();
    }
}
