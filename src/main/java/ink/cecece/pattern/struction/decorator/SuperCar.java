package ink.cecece.pattern.struction.decorator;

/**
 * 装饰器角色
 */
public class SuperCar implements ICar {

    //持有具体组件角色的引用
    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
       car.move();
    }
}
