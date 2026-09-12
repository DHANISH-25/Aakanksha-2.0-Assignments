//3. Write a Java program to accept an amount and calculate the number of ₹500, ₹200, ₹100, ₹50, and ₹20 notes required to represent the amount.
import java.util.Scanner;
class TakeInput{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Amount: ");
		int amount = sc.nextInt();

		int note500 = amount / 500;
		amount = amount % 500;

		int note200 = amount / 200;
		amount = amount % 200;

		int note100 = amount / 100;
		amount = amount % 100;

		int note50 = amount / 50;
		amount = amount % 50;

		int note20 = amount / 20;
		amount = amount % 20;

		int note10 = amount / 10;
		amount = amount % 10;

		System.out.println("Total 500 notes: " + note500);
		System.out.println("Total 200 notes: " + note200);
		System.out.println("Total 100 notes: " + note100);
		System.out.println("Total 50 notes: " + note50);
		System.out.println("Total 20 notes: " + note20);
		System.out.println("Total 10 notes: " + note10);

		sc.close();

}
}