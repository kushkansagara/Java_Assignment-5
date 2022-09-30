/*
    Name : Kansagara Kush;
    ID : 21CE051
*/
class Q {
    int n;
    boolean flag = false;
    synchronized int get()
    {
        while (!flag)
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println("Got: " + n);
        flag = false;
        notifyAll();
        return n;
    }
    synchronized void put(int n) {
        while (flag)
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        this.n = n;
        flag = true;
        System.err.println("Put: " + n);
        notify();
    }
}
class Producer implements Runnable {
    Q q;
    Thread t;
    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Producer");
    }
    public void run() {
        int i = 0;
        while (i < 10) {
            q.put(i++);
        }
    }
}
class Consumer implements Runnable {
    Q q;
    Thread t;
    public Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Consumer");
    }
    public void run() {
        while (true) {
            q.get();
        }
    }
}
class practical6_5 {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.t.start();
        c.t.start();
    }
}

