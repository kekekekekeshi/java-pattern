package ink.cecece.pattern.struction.bridge;

public class Apple implements Brand {
    @Override
    public void sale() {
        System.out.println("销售苹果");
    }
}
