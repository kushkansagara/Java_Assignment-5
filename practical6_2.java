/*
    Name : Kansagara Kush;
    ID : 21CE051
*/
import java.util.*;
class odd extends Thread {
    int[] array;
    odd(int[] array) {
        this.array = array;
        start();
    }
    public void run() {
        System.out.println("odd :-");
        for (int j = 0; j < array.length; j++) {
            if (j % 2 == 1) {
                System.out.println(array[j]);
            }
        }
    }
}
class even extends Thread {
    int[] array;
    even(int[] array) {
        this.array = array;
        start();
    }
    public void run() {
        System.out.println("Even :-");
        for (int j = 0; j < array.length; j++) {
            if (j % 2 == 0) {
                System.out.println(array[j]);
            }
        }
    }
}
class practical6_2
{
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = rand.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index" + i + " = " + arr[i]);
        }
        odd O = new odd(arr);
        even E = new even(arr);
    }
}
