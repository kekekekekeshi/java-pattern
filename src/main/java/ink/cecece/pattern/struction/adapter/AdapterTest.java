package ink.cecece.pattern.struction.adapter;

import org.junit.Test;

/**
 * 适配器模式
 *      - 将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
 * 优点
 *      - 客户端通过适配器可以透明地调用目标接口。
 *      - 复用了现存的类，程序员不需要修改原有代码而重用现有的适配者类。
 *      - 将目标类和适配者类解耦，解决了目标类和适配者类接口不一致的问题。
 * 缺点
 *      - 对类适配器来说，更换适配器的实现过程比较复杂。
 */
public class AdapterTest {

    /**
     * 类适配器
     */
    @Test
    public void testClass(){

        Target target = new ClassAdapter();
        target.request();
    }

    /**
     * 对象适配器
     */
    @Test
    public void testObject(){

        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
