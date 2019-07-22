package ThreadTest;

import org.omg.CORBA.TIMEOUT;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest3 {
    private Lock lock = new ReentrantLock();

    private void lockTest(Thread thread) throws InterruptedException {
        if (lock.tryLock(3000, TimeUnit.MILLISECONDS)) {
            try {
                System.out.println(thread.getName() + "获取到锁");
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                System.out.println(thread.getName() + "遇到异常释放锁");
            } finally {
                lock.unlock();
                System.out.println(thread.getName() + "线程执行完毕释放锁");
            }
        } else System.out.println("我是 "+thread.getName() + " ，当前锁被占用，等待三秒后获取当前锁失败");
    }

    public static void main(String[] args) {
        final LockTest3 lockTest = new LockTest3();
        Thread thread1 = new Thread("thread1") {
            public void run() {
                try {
                    lockTest.lockTest(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread2 = new Thread("thread2") {
            public void run() {
                try {
                    lockTest.lockTest(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.start();
        thread2.start();
    }


}
