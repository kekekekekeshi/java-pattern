package ink.cecece.pattern.struction.composite.countprice;

/**
 * 具体的商品：叶子节点
 */
public class Goods implements AbstractGoods {

    private String name;
    private int quantity;
    private float unitPrice;

    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public float count() {
        System.out.println("商品："+name+"{数量："+quantity+",单价："+unitPrice+"}");
        //单价*数量=总价
        return unitPrice*quantity;
    }
}
