package ThreadTest.produce_consumer;

public class Box {
    private int apple;

    public int getApple() {
        return apple;
    }

    public synchronized void increace(){
        while (apple == 5){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        apple++;
        System.out.println("生成苹果成功！apple have :"+apple);
        notify();
    }

    public synchronized void decreace(){
        while (apple == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        apple--;
        System.out.println("消费苹果成功 apple have :" + apple);
        notify();
    }
}
