package ThreadTest.produce_consumer;

import java.awt.event.PaintEvent;

public class Test1 {
    public static void main(String[] args) {
        Box box = new Box();
        Consumer consumer = new Consumer(box);
        Producer producer = new Producer(box);
        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(producer);
        t1.start();
        t2.start();
    }
}
