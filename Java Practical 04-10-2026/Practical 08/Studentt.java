class Studentt {
    String name;
    int rollNo;
    String department;

    Studentt(String n , int r , String d) {
        name = n;
        rollNo = r;
        department = d;
    }

    void studentDetails() {
        System.out.println("Student name: " + name);
        System.out.println("Student rollNo: " + rollNo);
        System.out.println("Student department: " + department);
    }

    public static void main(String[] args) {
        Studentt std = new Studentt("Krishna",48,"CSE");
        std.studentDetails();
    }
}