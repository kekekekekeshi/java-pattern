package ink.cecece.pattern.action.strategy;

public class OldCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("小批量老客户打9折！");
        return price*0.9;
    }
}
