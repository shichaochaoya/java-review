package ThreadTest.produce_consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueBox  {
    public static void main(String[] args) {
        BlockingQueue box = new LinkedBlockingDeque(5);
        Thread pro = new Thread(new QueueProducer(box));
        Thread con = new Thread(new QueueConsumer(box));
        pro.start();
        con.start();
    }
}
