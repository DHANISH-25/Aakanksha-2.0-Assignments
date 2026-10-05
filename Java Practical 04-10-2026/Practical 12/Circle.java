public class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    void circumference() {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of circle: " + circumference);
    }

    public static void main(String[] args) {
        Circle cr = new Circle(6.9);
        cr.area();
        cr.circumference();
    }
}
