package ink.cecece.pattern.struction.decorator;

import org.junit.Test;

/**
 * 装饰器模式
 * 1.扩展对象的功能比继承方式更灵活
 * 2.可以设计多个不同的具体装饰类，创造多个不同行为的组合
 * 缺点：
 *      装饰器模式增加了许多子类，过度使用会使得程序变得额复杂
 * 结构：
 *      -  抽象组件角色： 定义一个抽象接口以规范准备接收附加责任的对象
 *      -  具体组件角色：实现抽象组件，通过装饰角色为其添加一些职责
 *      -  抽象装饰角色：结成抽象组件，并包含具体组件的实例，可以通过其子类扩展具体的功能
 *      -  具体装饰角色：实现抽象装饰的相关方法，并给具体组件添加附加责任
 */
public class DecoratorTest {

    @Test
    public void test(){
        Car car = new Car();
        car.move();
        System.out.println("========增加飞行功能=========");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        System.out.println("========增加游泳功能=========");
        SwimCar swimCar = new SwimCar(car);
        swimCar.move();
        System.out.println("========增加无人驾驶功能=========");
        AICar aiCar = new AICar(car);
        aiCar.move();
        System.out.println("========增加无人驾驶、飞行功能=========");
        AICar aiCar1 = new AICar(flyCar);
        aiCar1.move();
        System.out.println("========增加无人驾驶、游泳、飞行功能=========");
        SwimCar swimCar1 = new SwimCar(aiCar1);
        swimCar1.move();
    }
}
