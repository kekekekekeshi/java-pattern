package ink.cecece.pattern.struction.decorator;

public class SwimCar extends SuperCar {

    public SwimCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("水里游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
