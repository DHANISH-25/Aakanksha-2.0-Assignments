public class Rectangle {
    double length = 98.56;
    double width = 56.45;

    public void area() {
        double rectangle_area = length * width;
        System.out.println(rectangle_area);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.area();
    }
}
