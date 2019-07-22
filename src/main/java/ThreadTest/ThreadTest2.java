package ThreadTest;


class ThreadDemo2 extends Thread {
    private Thread t;
    private String name;

    public ThreadDemo2(String name) {
        System.out.println("Creating  " + name);
        this.name = name;
    }

    @Override
    public  void start() {
        System.out.println("Thread " + name + " start");
        if (t == null) {
            t = new Thread(this, name);
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + "running");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + name + ":" + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread  " + name + "exiting");
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        ThreadDemo2 t1 = new ThreadDemo2("t1");
        t1.start();
        ThreadDemo2 t2 = new ThreadDemo2("t2");
        t2.start();
    }

}
