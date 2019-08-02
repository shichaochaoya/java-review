package design.factorys.abstractFactory;

import design.factorys.bean.Car;
import design.factorys.bean.Color;

public class Test {
    public static void main(String[] args) {
        //获取工厂
        AbstractFactory carFactory = FactoryProduct.getFactory("Car");
        AbstractFactory colorFactory = FactoryProduct.getFactory("Color");
        Car car1 = carFactory.getCar("bmw");
        System.out.println(car1.getName());
        Car car2 = carFactory.getCar("benz");
        System.out.println(car2.getName());

        Color red = colorFactory.getColor("Red");
        red.print();
        Color blue = colorFactory.getColor("Blue");
        blue.print();
/*        Color defultColor = colorFactory.getColor("yellow");
        defultColor.print();*/

    }
}
