class Student{
    private String name;
    private int age;

    public void setName( String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        Student s = new Student();

        s.setName("Dhanish kumar");
        s.setAge(26);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}