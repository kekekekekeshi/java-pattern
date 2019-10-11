package ink.cecece.pattern.struction.bridge;

public class Pad extends Computer {

    public Pad(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        brand.sale();
        System.out.println("销售PAD");
    }
}
