package ink.cecece.pattern.struction.decorator;

public class AICar extends SuperCar {

    public AICar(ICar car) {
        super(car);
    }

    public void auto(){
        System.out.println("无人驾驶");
    }

    @Override
    public void move() {
        super.move();
        auto();
    }
}
