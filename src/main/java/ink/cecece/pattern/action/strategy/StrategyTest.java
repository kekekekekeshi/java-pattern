package ink.cecece.pattern.action.strategy;

import org.junit.Test;

/**
 * 策略模式
 * 通过环境类操作
 */
public class StrategyTest {

    @Test
    public void test(){

        Context context = new Context(new NewCustomerFewStrategy());
        context.printPrice(100);
        context = new Context(new NewCustomerMoreStrategy());
        context.printPrice(100);
        context = new Context(new OldCustomerFewStrategy());
        context.printPrice(100);
        context = new Context(new OldCustomerMoreStrategy());
        context.printPrice(100);
    }
}
