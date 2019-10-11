package ink.cecece.pattern.struction.bridge;

import org.junit.Test;

/**
 * 桥接模式
 *      - 将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度
 * 解决多层继承问题
 *                 |     联想台式机
 *       | 台式     |     戴尔台式机
 *       |         |     苹果台式机
 *       |
 *       |         |    联想笔记本
 * 电脑   | 笔记本   |    戴尔笔记本
 *       |         |    苹果笔记本
 *       |
 *       |         |    联想PAD
 *       | PAD     |    戴尔PAD
 *       |         |    苹果PAD
 *  优点
 *     - 由于抽象与实现分离，所以扩展能力强；
 *     - 其实现细节对客户透明。
 *  缺点
 *     - 由于聚合关系建立在抽象层，要求开发者针对抽象化进行设计与编程，这增加了系统的理解与设计难度。
 */
public class BridgeTest {

    @Test
    public void test(){
        System.out.println("====================");
        Brand lenovo = new Lenovo();
        Computer lenovoDesktop = new Desktop(lenovo);
        lenovoDesktop.sale();
        Computer lenovoPad = new Pad(lenovo);
        lenovoPad.sale();
        Computer lenovoLaptop = new Laptop(lenovo);
        lenovoLaptop.sale();
        System.out.println("====================");
        Brand dell = new Dell();
        Computer dellDesktop = new Desktop(dell);
        dellDesktop.sale();
        Computer dellPad = new Pad(dell);
        dellPad.sale();
        Computer dellLaptop = new Laptop(dell);
        dellLaptop.sale();
        System.out.println("====================");
        Brand apple = new Apple();
        Computer appleDesktop = new Desktop(apple);
        appleDesktop.sale();
        Computer applePad = new Pad(apple);
        applePad.sale();
        Computer appleLaptop = new Laptop(apple);
        appleLaptop.sale();
    }
}
