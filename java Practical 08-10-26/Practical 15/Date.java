public class Date {
    int day;
    int month;
    int year;

    //default constructor, parameterized constructor, and overloaded constructors**. Validate the date before storing it and display
    //the date in `DD-MM-YYYY` format.

    Date() {
    day = 1;
    month = 1;
    year = 2000;
    }

    Date(int d, int m, int y) {
    day = d;
    month = m;
    year = y;
    }

    Date(int d, int m) {
    day = d;
    month = m;
    year = 2025;
    }

    void display(){
        System.out.println(day+":"+month+":"+year);
        System.out.println();
    }


    public static void main(String[] args) {
        Date dt = new Date();
        Date dt1 = new Date(31,5, 2002);
        Date dt2 = new Date(28,5,2026);
        dt.display();
        dt1.display();
        dt2.display();
    }
}
