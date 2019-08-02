package design.factorys.factory;

public class Test {
    public static void main(String[] args) {
        Facory bmwFactory = new BmwFactory();
        Facory benzFaztory = new BenzFactory();
        System.out.println(bmwFactory.getCar().getName());
        System.out.println(benzFaztory.getCar().getName());
    }
}
