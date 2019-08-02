package design.factorys.abstractFactory;

import design.factorys.bean.Benz;
import design.factorys.bean.Car;

public abstract class AbstractFactory {
    protected abstract Car getCar();

    //动态配置,固定模式的委派
    public Car getCar(String name){
        if ("BMW".equalsIgnoreCase(name)){
            return new BmwFactory().getCar();
        }else if ("Benz".equalsIgnoreCase(name)){
            return new BenzFactory().getCar();
        }else System.out.println("对不起，您的车型不存在");
        return null;
    }
}
