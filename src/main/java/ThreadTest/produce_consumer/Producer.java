package ThreadTest.produce_consumer;

import sun.java2d.pipe.SpanIterator;

import java.util.concurrent.ThreadPoolExecutor;

public class Producer implements Runnable {
    private Box box;

    public Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("pro i: " + i);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            box.increace();
        }
    }
}
