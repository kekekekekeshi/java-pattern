package ink.cecece.pattern.action.strategy;

/**
 * 环境类：负责跟具体的策略打交道
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context setStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public void printPrice(double price){
        System.out.println("您的价格："+strategy.getPrice(price));
    }
}
