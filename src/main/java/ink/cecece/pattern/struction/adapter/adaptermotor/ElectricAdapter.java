package ink.cecece.pattern.struction.adapter.adaptermotor;

public class ElectricAdapter implements Motor {

    private ElectricMotor electricMotor;

    public ElectricAdapter(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor;
    }

    @Override
    public void drive() {
        electricMotor.electricDrive();
    }
}
