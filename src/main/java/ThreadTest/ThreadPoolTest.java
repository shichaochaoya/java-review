package ThreadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable2 implements Runnable{
    public void run() {
        for (int i = 0; i < 20000; i++) {
            System.out.println("自定义线程 任务在执行" + i );
        }
    }
}

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(5);
        MyRunnable2 r2 = new MyRunnable2();
        executors.submit(r2);
        System.out.println("--------------");
        executors.submit(r2);
        executors.shutdown();
    }
}
