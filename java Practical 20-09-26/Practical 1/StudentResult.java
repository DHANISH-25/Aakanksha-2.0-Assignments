import java.util.Scanner;
class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your RollNumber: ");
        int rollNumber = sc.nextInt();
        System.out.println("Enter Your first subject mark: ");
        int sub1 = sc.nextInt();
        System.out.println("Enter Your Second subject Mark: ");
        int sub2 = sc.nextInt();
        System.out.println("Enter Your third Subject mark: ");
        int sub3 =  sc.nextInt();

        int total = sub1+sub2+sub3;
        double percentage = (total/300.0)*100;

        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Subject 1 : " + sub1);
        System.out.println("Subject 2 : " + sub2);
        System.out.println("Subject 3 : " + sub3);
        System.out.println("Total Marks : " + total);
        System.out.printf("Percentage : %.2f%%\n", percentage);


        if (sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
            System.out.println("Status : Passed");
        } else {
            System.out.println("Status : Failled");
        }

        sc.close();

    }
}