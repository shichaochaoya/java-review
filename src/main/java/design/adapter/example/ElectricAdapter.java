package design.adapter.example;

public class ElectricAdapter implements Motor {
    private ElectricMotor electricMotor;

    public ElectricAdapter() {
        if (electricMotor == null) {
            electricMotor = new ElectricMotor();
        }
    }

    @Override
    public void drive() {
        electricMotor.electricDrive();
    }
}
