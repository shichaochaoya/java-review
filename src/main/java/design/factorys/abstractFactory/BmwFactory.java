package design.factorys.abstractFactory;

import design.factorys.bean.Bmw;
import design.factorys.bean.Car;
import design.factorys.factory.Facory;

public class BmwFactory extends AbstractFactory{
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
