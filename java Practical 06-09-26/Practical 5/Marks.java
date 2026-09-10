public class Marks {
    public static void main(String[] args) {
        float math = 95.5f;
        float science = 88.85f;
        float history = 68.5f;
        float total = math + science + history;
        float average = total/3.0f;

        System.out.println("Total Marks of all three subjects is: " + total);
        System.out.println("Average of the all subjects marks is: " + average);
    }
}
