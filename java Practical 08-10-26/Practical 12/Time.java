public class Time {
    int hours;
    int minutes;
    int seconds;

    Time(int h){
        hours = h;
    }
    Time(int h, int m){
        hours = h;
        minutes = m;
    }
    Time(int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
    }

    void display(){
        System.out.println( hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        Time t = new Time(8);
        Time t1 = new Time(9, 25);
        Time t2 = new Time(11, 58, 14);

        t.display();
        t1.display();
        t2.display();
    }
}
