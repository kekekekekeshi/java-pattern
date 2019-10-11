package ink.cecece.pattern.struction.adapter.adaptermotor;

import org.junit.Test;

public class MotorAdapterTest {

    @Test
    public void test(){

        ElectricMotor electricMotor = new ElectricMotor();
        OpticalMotor opticalMotor = new OpticalMotor();
        Motor motor = new ElectricAdapter(electricMotor);
        motor.drive();
        motor = new OpticalAdapter(opticalMotor);
        motor.drive();
    }
}
