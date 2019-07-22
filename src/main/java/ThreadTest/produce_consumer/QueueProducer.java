package ThreadTest.produce_consumer;

import java.util.concurrent.BlockingQueue;

public class QueueProducer implements Runnable{
    private final BlockingQueue proQueue;

    public QueueProducer(BlockingQueue proQueue) {
        this.proQueue = proQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("生产者生产的苹果编号为： " + i);
            try {
                Thread.sleep(1000);
                proQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
