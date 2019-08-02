package design.factorys.abstractFactory;

import design.factorys.bean.Benz;
import design.factorys.bean.Car;
import design.factorys.bean.Color;

public abstract class AbstractFactory {
    abstract Car getCar(String car);
    abstract Color getColor(String color);

}
