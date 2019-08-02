package design.factorys.abstractFactory;

import design.factorys.bean.Benz;
import design.factorys.bean.Bmw;
import design.factorys.bean.Car;
import design.factorys.bean.Color;

public class CarAbstractFactory extends AbstractFactory {
    @Override
    Car getCar(String car) {
        if(car == null) {
            return null;
        }else if (car.equalsIgnoreCase("Bmw")){
            return new Bmw();
        }else if (car.equalsIgnoreCase("Benz")){
            return new Benz();
        }else return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
