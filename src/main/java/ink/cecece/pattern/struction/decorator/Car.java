package ink.cecece.pattern.struction.decorator;

/**
 * 具体组件角色：被装饰对象
 */
public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("地上跑");
    }
}
