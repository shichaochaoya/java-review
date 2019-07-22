package ThreadTest;

public class ThreadTest3 {
    private int j;

    public static void main(String[] args) {
        ThreadTest3 t3 = new ThreadTest3();
        Inc inc = t3.new Inc();
        Dec dec = t3.new Dec();
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(inc);
            thread.start();
            Thread thread1 = new Thread(dec);
            thread1.start();
        }


    }

    private synchronized void inc() {
        System.out.println(Thread.currentThread().getName() + "inc" + j);
        j++;
    }

    private synchronized void dec() {
        System.out.println(Thread.currentThread().getName() + "dec" + j);
        j--;
    }

    private class Inc implements Runnable {
        public void run() {
            for (int i = 0; i < 100; i++) {
                inc();
            }
        }
    }

    private class Dec implements Runnable {

        public void run() {
            for (int i = 0; i < 100; i++) {
                dec();
            }
        }
    }

}
