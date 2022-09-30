/*
    Name : Kansagara Kush;
    ID : 21CE051
*/
class Practical6_3 {
    public static void main(String[] args) {
        int count = 0;
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                count++;
                System.out.println("Value of variable after one second is :" + count);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception is occured " + e);
        }
    }
}