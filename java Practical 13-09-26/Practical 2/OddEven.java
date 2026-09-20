
import java.util.Scanner;

class OddEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three-digit number: ");
		int num = sc.nextInt();
		if (num%2 == 0) {
			System.out.println("Given Number is Even.");
		} else {
			System.out.println("Given Number is Odd.");
		}

		sc.close();
	}
}