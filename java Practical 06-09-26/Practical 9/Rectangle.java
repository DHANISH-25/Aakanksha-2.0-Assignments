public class Rectangle {
    public static void main(String[] args) {
        double length = 24.8;
        double breadth = 10.5;

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        // Template System: Comma separates the template from the variable filling it
        System.out.printf("Area of rectangle is: %.2f%n", area);

        System.out.println("Perimeter of rectangle is: " + perimeter);

    }
}
