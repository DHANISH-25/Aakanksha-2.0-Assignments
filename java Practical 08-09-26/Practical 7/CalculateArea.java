public class CalculateArea {
    double length;
    double breadth;
    double area;
    void calculateRectangleArea(double length, double breadth){
        area = length * breadth;
        System.out.println("Area of the Rectangle is: " + area);
    }

    public static void main(String[] args) {
        CalculateArea value = new CalculateArea();
        value.calculateRectangleArea(3.5,2.5);

    }
}
