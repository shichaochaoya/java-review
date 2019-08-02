package design.factorys.abstractFactory;

import design.factorys.bean.Benz;
import design.factorys.bean.Car;
import design.factorys.factory.Facory;

public class BenzFactory extends AbstractFactory {

    @Override
    protected Car getCar() {
        return new Benz();
    }
}
