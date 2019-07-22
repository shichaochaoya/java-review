package test;

public class AbstractTest {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        System.out.println(apple.scale());
        Peach peach = new Peach();
        System.out.println(peach.scale());
        apple.print();
        peach.print();
    }
}
