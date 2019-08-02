package design.singleton;

/**
 * 饿汉式单例模式
 * 效率高 ， 线程安全，但是不能延迟加载
 */
public class SingletonDemo1 {
    private static final SingletonDemo1 singletonDemo1 = new SingletonDemo1();

     private SingletonDemo1() {
        System.out.println("饿汉式单例实例化");
    }

     public static SingletonDemo1 getSingletonDemo1() {
        return singletonDemo1;
    }
    public static void print(){
        System.out.println("饿汉式单例模式");
    }

}
/*
 * 一上来就把单例对象创建出来了，要用的时候直接返回即可，这种可以说是单例模式中最简单的一种实现方式。
 * 但是问题也比较明显。单例在还没有使用到的时候，初始化就已经完成了。
 * 也就是说，如果程序从头到位都没用使用这个单例的话，单例的对象还是会创建。这就造成了不必要的资源浪费。所以不推荐这种实现方式。
 * */