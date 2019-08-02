package design.singleton;

/**
 * 4.静态内部类实现模式（线程安全，调用效率高，可以延时加载）
 */
public class SingletonDemo4 {

    private static class SingletonClassInstance {
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }


    private SingletonDemo4() {
        System.out.println("静态内部类实现单例模式");
    }


    public static SingletonDemo4 getInstance() {
        return SingletonClassInstance.instance;
    }
}
