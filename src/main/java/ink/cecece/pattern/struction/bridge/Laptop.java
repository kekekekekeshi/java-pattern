package ink.cecece.pattern.struction.bridge;

public class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        brand.sale();
        System.out.println("销售笔记本");
    }
}
