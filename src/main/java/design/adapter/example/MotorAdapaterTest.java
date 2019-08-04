package design.adapter.example;

public class MotorAdapaterTest {
    public static void main(String[] args) {
        System.out.println("适配器模式测试：");
        Motor motor= new OpticalAdapater();
        motor.drive();
    }
}
