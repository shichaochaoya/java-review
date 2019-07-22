package ThreadTest;

class MyRunnable implements Runnable {
    String name;
    Thread t;

    public MyRunnable(String name) {
        System.out.println("Creating" + name);
        this.name = name;
    }

    public void run() {
        System.out.println("Thread" + name + "Running");
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Thread" + name +":"+ i);
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + name + " exiting");
    }

    public void start() {
        System.out.println("start" + name);
        if (t == null) {
            t = new Thread(this,name);
            t.start();
        }
    }


}

public class ThreadTest {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable("r1");
        r1.start();
        MyRunnable r2 = new MyRunnable("r2");
        r2.start();
    }
}
