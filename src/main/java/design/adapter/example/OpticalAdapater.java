package design.adapter.example;

public class OpticalAdapater implements Motor {
    private OpticalMotor opticalMotor;

    public OpticalAdapater() {
        if (opticalMotor == null) {
            opticalMotor = new OpticalMotor();
        }
    }

    @Override
    public void drive() {
        opticalMotor.opticalDrive();
    }
}
