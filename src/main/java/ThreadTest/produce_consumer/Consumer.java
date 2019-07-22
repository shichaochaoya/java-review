package ThreadTest.produce_consumer;

public class Consumer extends Thread {
    private Box box;

    public Consumer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("con i : " + i);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            box.decreace();
        }
    }
}
