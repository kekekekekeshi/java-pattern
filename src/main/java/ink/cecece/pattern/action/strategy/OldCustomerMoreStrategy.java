package ink.cecece.pattern.action.strategy;

public class OldCustomerMoreStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("大批量老客户打8折！");
        return price*0.8;
    }
}
