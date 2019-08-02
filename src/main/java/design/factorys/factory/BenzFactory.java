package design.factorys.factory;

import design.factorys.bean.Benz;
import design.factorys.bean.Car;

public class BenzFactory implements Facory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
