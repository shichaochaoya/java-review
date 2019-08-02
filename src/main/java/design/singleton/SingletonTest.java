package design.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonDemo1 singletonDemo1 = SingletonDemo1.getSingletonDemo1();
        SingletonDemo1 singletonDemo11 = SingletonDemo1.getSingletonDemo1();
        System.out.println(singletonDemo1);
        System.out.println(singletonDemo11);

        SingletonDemo2 singletonDemo2 = SingletonDemo2.getSingletonDemo2();
        SingletonDemo2 singletonDemo21 = SingletonDemo2.getSingletonDemo2();
        System.out.println(singletonDemo2);
        System.out.println(singletonDemo21);

        SingletonDemo3 singletonDemo3 = SingletonDemo3.getSingletonDemo3();
        SingletonDemo3 singletonDemo31 = SingletonDemo3.getSingletonDemo3();
        System.out.println(singletonDemo3);
        System.out.println(singletonDemo31);

        SingletonDemo4 singletonDemo4 = SingletonDemo4.getInstance();
        SingletonDemo4 singletonDemo41 = SingletonDemo4.getInstance();
        System.out.println(singletonDemo4);
        System.out.println(singletonDemo41);

    }
}
