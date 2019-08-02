package design.singleton;

/**
 * 懒汉式，线程安全，调用效率不高，但可以延时加载
 */
public class SingletonDemo2 {
    private static SingletonDemo2 singletonDemo2;

    private SingletonDemo2() {
        System.out.println("懒汉单例模式实例化");
    }

    public synchronized static SingletonDemo2 getSingletonDemo2() {
        if (singletonDemo2 == null) {
            singletonDemo2 = new SingletonDemo2();
        }
        return singletonDemo2;
    }
}
/*
 *
 * */