package test;

public class Apple extends Fruit {
    @Override
    public String shape() {
        return "Circle";
    }

    @Override
    String taste() {
        return "sweet";
    }

    @Override
    int scale() {
        return 10;
    }

    @Override
    public void print() {
        System.out.println("i m an apple");;
    }
}
