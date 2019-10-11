package ink.cecece.pattern.action.strategy;

public class NewCustomerMoreStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("大批量新客户打8.5折！");
        return price*0.85;
    }
}
