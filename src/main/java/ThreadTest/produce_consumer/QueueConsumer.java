package ThreadTest.produce_consumer;

import java.util.concurrent.BlockingQueue;

public class QueueConsumer implements Runnable {
    private final BlockingQueue conQueue;

    public QueueConsumer(BlockingQueue conQueue) {
        this.conQueue = conQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("消费者消费的苹果编号为 ：" + conQueue.take());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
