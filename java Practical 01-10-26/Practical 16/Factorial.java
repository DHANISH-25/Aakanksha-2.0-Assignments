/*16\. Write a Java program to create a `Factorial` class with a method that accepts a number and returns its factorial.*/

class Factorial{
    double factorial(int num){
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Factorial fc = new Factorial();
        System.out.println("Factorial of 5 is: " + fc.factorial(9));
    }
}