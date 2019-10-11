package ink.cecece.pattern.struction.composite.countprice;

import java.util.ArrayList;
import java.util.List;

public class Bag implements AbstractGoods {

    //包裹名称
    private String name;
    //包裹容器
    private List<AbstractGoods> bags = new ArrayList<>();

    public Bag(String name) {
        this.name = name;
    }

    /**
     * 添加
     * @param goods
     * @return
     */
    public Bag add(AbstractGoods goods){
        bags.add(goods);
        return this;
    }

    /**
     * 移除
     * @param goods
     * @return
     */
    public Bag remove(AbstractGoods goods){
        bags.remove(goods);
        return this;
    }

    /**
     * 获取子节点
     * @param idx
     * @return
     */
    public AbstractGoods getChild(int idx){
        return bags.get(idx);
    }

    @Override
    public float count() {

        System.out.println("口袋："+name+"计算...");

        float price = 0;
        for(AbstractGoods goods : bags){

            price += goods.count();
        }

        return price;
    }
}
