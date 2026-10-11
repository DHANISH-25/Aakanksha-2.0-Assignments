public class Rectangle {
    double length;
    double breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    void perimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(56.25, 24.65);
        rc.area();
        rc.perimeter();
    }
}
