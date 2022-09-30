/*
    Name : Kansagara Kush;
    ID : 21CE051
*/
import java.lang.*;
class practical6_4 extends Thread {
    public void run() {
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        practical6_4 FIRST = new practical6_4();
        practical6_4 SECOND = new practical6_4();
        practical6_4 THIRD = new practical6_4();
        System.out.println("First thread priority : " + FIRST.getPriority());
        System.out.println("Second thread priority : " + SECOND.getPriority());
        System.out.println("Third thread priority : " + THIRD.getPriority());
        FIRST.setPriority(3);
        SECOND.setPriority(5);
        THIRD.setPriority(7);
        System.out.println("\nFirst thread priority : " + FIRST.getPriority());
        System.out.println("Second thread priority : " + SECOND.getPriority());
        System.out.println("Third thread priority : " + THIRD.getPriority());
    }
}

