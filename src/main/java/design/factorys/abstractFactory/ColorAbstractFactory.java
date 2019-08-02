package design.factorys.abstractFactory;

import design.factorys.bean.*;

public class ColorAbstractFactory extends AbstractFactory {
    @Override
    Car getCar(String car) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if(color == null) {
            return null;
        }else if (color.equalsIgnoreCase("Red")){
            return new Red();
        }else if (color.equalsIgnoreCase("Blue")){
            return new Blue();
        }else return null;    }
}
