package design.adapter;

public class Test {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();

        System.out.println("对象适配器测试 ：");
        Adaptee adaptee = new Adaptee();
        ObjAdapter objAdapter = new ObjAdapter(adaptee);
        objAdapter.request();
    }
}
