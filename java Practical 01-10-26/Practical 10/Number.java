/*10\. Write a Java program to create a `Number` class with methods to check whether a number is even/odd, positive/negative, and prime. */

import java.util.Scanner;

class Number{
    static void checkEvenOdd(int num){
        if (num/2 == 0) {
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    }

    static void checkPositiveNegative(int num){
        if (num > 0) {
            System.out.println("Number is Positive.");
        }else 
            System.out.println("Number is Negative");
    }

    static boolean checkPrime(int num){
        if (num < 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int num = sc.nextInt();
        if (checkPrime(num)) {
            System.out.println("Number is Prime");
        }else
            System.out.println("Number is not Prime");

        checkEvenOdd(num);
        checkPositiveNegative(num);

        sc.close();
    }
}