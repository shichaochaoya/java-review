package design.factorys.abstractFactory;

public class FactoryProduct {
    public static AbstractFactory getFactory(String s){
        if (s.equalsIgnoreCase("Color")){
            return new ColorAbstractFactory();
        }else if (s.equalsIgnoreCase("Car")){
            return new CarAbstractFactory();
        }else return null;
    }
}
