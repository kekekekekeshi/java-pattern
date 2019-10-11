package ink.cecece.pattern.struction.bridge;

public class Computer {

    protected  Brand brand;

    public Computer(Brand brand){
        this.brand = brand;
    }

    void sale(){
        brand.sale();
    }

}
