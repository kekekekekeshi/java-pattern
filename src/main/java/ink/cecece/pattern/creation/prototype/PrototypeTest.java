package ink.cecece.pattern.creation.prototype;

import org.junit.Test;

import java.util.Date;

public class PrototypeTest {

    /**
     * 实现Cloneable接口
     * 重写clone方法
     * clone中实现对指定成员的深克隆
     * @throws CloneNotSupportedException
     */
    @Test
    public void test() throws CloneNotSupportedException {

        Sheep sheep = new Sheep();
        sheep.setName("Prototype").setBirthday(new Date(1548949875L));
        //克隆一个对象
        Sheep doly = (Sheep) sheep.clone();
        //修改数据
        doly.setName("Doly").setBirthday(new Date(186485945889L));
        //输出对比数据
        System.out.println(sheep);
        System.out.println(doly);
        //对比对象
        System.out.println("是否为同一对象："+(sheep == doly));
    }
}
