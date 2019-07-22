package ThreadTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    private Lock lock = new ReentrantLock();

    private void lockTest(Thread thread) {
        lock.lock();
        try {
            System.out.println(thread.getName() + "获取到锁");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + "遇到异常释放锁");
        }finally {
            lock.unlock();
            System.out.println("线程执行完毕释放锁");
        }
    }

    public static void main(String[] args) {
        final LockTest lockTest = new LockTest();
        Thread thread1 = new Thread("thread1") {
            public void run() {
                lockTest.lockTest(Thread.currentThread());
            }
        };

        Thread thread2 = new Thread("thread2"){
            public void run(){
                lockTest.lockTest(Thread.currentThread());
            }
        };
        thread1.start();
        thread2.start();
    }


}
