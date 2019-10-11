package ink.cecece.pattern.action.template;

import org.junit.Test;

/**
 * 模板方法模式
 * 定义算法骨架，具体的算法延迟到子类实现
 */
public class TemplateMethodTest {

    @Test
    public void test(){
        Bank bank = new Bank();
        bank.process();
    }
}
