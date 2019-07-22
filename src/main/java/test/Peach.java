package test;

public class Peach extends Fruit {
    @Override
    public String shape() {
        return "i dont know";
    }

    @Override
    String taste() {
        return "sweet";
    }

    @Override
    int scale() {
        return 15;
    }

    @Override
    public void print() {
        System.out.println("i m a peach");
    }
}
