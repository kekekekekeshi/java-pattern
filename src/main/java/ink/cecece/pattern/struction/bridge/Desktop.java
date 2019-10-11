package ink.cecece.pattern.struction.bridge;

public class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        brand.sale();
        System.out.println("销售台式机");
    }
}
