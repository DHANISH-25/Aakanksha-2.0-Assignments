/* Create a Student class using constructor + setter validation. */
public class Student1{
    private String name;
    private int age;

    public Student1(String name, int age){
        setName(name);
        setAge(age);
    }

    public void setName(String name){
        if (name != null && !name.isEmpty()) {
            this.name=name;
        }else{
            System.out.println("invalid name.");
        }
        
    }

    public void setAge(int age){
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid Age!");
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }

    public static void main(String[] args) {
        Student1 s = new Student1("Dhanish Kumar", 17);
        Student1 s1 = new Student1("", 24);

        s.display();
        s1.display();

    }


}