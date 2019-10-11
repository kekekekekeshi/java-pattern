package ink.cecece.pattern.action.strategy;

public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("小批量新客户不打折！");
        return price;
    }
}
