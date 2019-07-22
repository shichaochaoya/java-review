package ThreadTest;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TickerTest {
    public static void main(String[] args) {
        SellTicker sellTicker = new SellTicker();

        /*Thread t1 = new Thread(sellTicker, "窗口1");
        Thread t2 = new Thread(sellTicker, "窗口2");
        Thread t3 = new Thread(sellTicker, "窗口3");
        Thread t4 = new Thread(sellTicker, "窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();*/
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.submit(sellTicker);
        service.submit(sellTicker);
        service.submit(sellTicker);
        service.submit(sellTicker);
    }
}
