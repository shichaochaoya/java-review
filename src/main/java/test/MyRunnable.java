package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 线程池提交到执行结束经历
 * */
public class MyRunnable implements Runnable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" +i);
        }
    }
}
