package design.factorys.factory;

import design.factorys.bean.Bmw;
import design.factorys.bean.Car;

public class BmwFactory implements Facory {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
