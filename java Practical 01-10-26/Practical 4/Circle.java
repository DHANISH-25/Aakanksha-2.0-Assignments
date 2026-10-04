public class Circle {
    double radius = 25;

    void circumference() {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of Circle is: " + circumference);
    }

    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle is: " + area);
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.circumference();
        obj.area();
    }
}
