package design.factorys.simpleFactory;

import design.factorys.bean.Car;

public class Test {
    public static void main(String[] args) {
        SimpleFactory carFactory = new SimpleFactory();
        Car bmw = carFactory.getCar("BMW");
        System.out.println(bmw.getName());
        Car benz = carFactory.getCar("BENZ");
        System.out.println(benz.getName());
    }
}
