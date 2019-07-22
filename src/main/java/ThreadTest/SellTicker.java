package ThreadTest;

public class SellTicker implements Runnable {
    private static int ticker = 100;
    Object object = new Object();


    public void run() {
        while (ticker > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sellTicker();
        }
    }

    private synchronized void sellTicker() {
        if (ticker > 0) {
            ticker--;
            System.out.println(Thread.currentThread().getName() + "买票 ， " + "还剩 " + ticker + "张");
        } else System.out.println(Thread.currentThread().getName() + "票卖完了");
    }
}
