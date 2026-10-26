public class Person {
    private int age;

    public Person(int age) {
        setAge(age);
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Age must be between 0 and 120.");
        }
    }

    public int getAge() {
        return age;
    }


    public void display() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Person p1 = new Person(25);
        Person p2 = new Person(150);

        p1.display();
        p2.display();
    }
}
