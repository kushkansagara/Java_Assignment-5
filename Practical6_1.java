/*
    Name : Kansagara Kush;
    ID : 21CE051
*/
class practical6_1 extends Thread {
    public void run() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        practical6_1 t = new practical6_1();
        System.out.println("extending Thread class : ");
        t.start();
        practical6_1 t1 = new practical6_1();
        System.out.println("Runnable interface : ");
        Thread d = new Thread(t1);
        d.start();
    }



}

