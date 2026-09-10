public class MethodCall {

    void displayStudent(String name, int age, double marks){

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        MethodCall student = new MethodCall();
        student.displayStudent("Dhanish Kumar", 24, 98.6);
    }
}
