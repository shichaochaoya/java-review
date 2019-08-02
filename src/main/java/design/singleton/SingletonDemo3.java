package design.singleton;

/**
 * DCL也就是双重锁判断机制（由于JVM底层模型原因，偶尔会出问题，不建议使用）：
 */

public class SingletonDemo3 {
    private volatile static SingletonDemo3 singletonDemo3;

    private SingletonDemo3() {
        System.out.println("双重锁单例模式实例化");
    }

    public static SingletonDemo3 getSingletonDemo3() {
        if (singletonDemo3 == null) {
            synchronized (SingletonDemo3.class) {
                if (singletonDemo3 == null) {
                    singletonDemo3 = new SingletonDemo3();
                }
            }
        }
        return singletonDemo3;
    }
}
