package design.factorys.simpleFactory;

import design.factorys.bean.Benz;
import design.factorys.bean.Bmw;
import design.factorys.bean.Car;

public class SimpleFactory {
    public Car getCar(String name){
        if (name.equals("BMW")){
            return new Bmw();
        }else if (name.equals("BENZ")){
            return new Benz();
        }else
            System.out.println("不好意思，这款车型不存在");
        return null;
    }
}
