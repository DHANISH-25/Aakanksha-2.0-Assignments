/*15\. Write a Java program to create a `Calculator` class implementing method overloading for addition of two integers, three integers, and two double values.*/

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println("Addition of two integers: " + obj.add(10, 20));

        System.out.println("Addition of three integers: " + obj.add(10, 20, 30));

        System.out.println("Addition of two double values: " + obj.add(10.5, 20.5));
    }
}
