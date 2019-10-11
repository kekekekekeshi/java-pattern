package ink.cecece.pattern.struction.composite.countprice;

import org.junit.Test;

/**
 * 假如李先生到韶关“天街e角”生活用品店购物，
 *      - 用 1 个红色小袋子装了 2 包婺源特产（单价 7.9 元）、1 张婺源地图（单价 9.9 元）；
 *      - 用 1 个白色小袋子装了 2 包韶关香藉（单价 68 元）和 3 包韶关红茶（单价 180 元）；
 *      - 用 1 个中袋子装了前面的红色小袋子和 1 个景德镇瓷器（单价 380 元）；
 *      - 用 1 个大袋子装了前面的中袋子、白色小袋子和 1 双李宁牌运动鞋（单价 198 元）。
 * 最后“大袋子”中的内容有：{1 双李宁牌运动鞋（单价 198 元）、白色小袋子{2 包韶关香菇（单价 68 元）、
 * 3 包韶关红茶（单价 180 元）}、中袋子{1 个景德镇瓷器（单价 380 元）、红色小袋子{2 包婺源特产（单价 7.9 元）、1 张婺源地图（单价 9.9 元）}}}，
 * 现在要求编程显示李先生放在大袋子中的所有商品信息并计算要支付的总价。
 */
public class CountPriceTest {

    @Test
    public void test(){

        Goods goods = new Goods("婺源特产", 2, 7.9f);
        Goods map = new Goods("婺源地图", 1, 9.9f);
        Bag redSmallBag = new Bag("红色小袋子");
        redSmallBag.add(goods).add(map);

        Goods incense = new Goods("韶关香藉", 2,68f );
        Goods tea = new Goods("韶关红茶", 2,180f );
        Bag whiteSmallBag = new Bag("白色小袋子");
        whiteSmallBag.add(incense).add(tea);

        Goods china = new Goods("景德镇瓷器", 1, 380f);
        Bag midBag = new Bag("中袋子");
        midBag.add(redSmallBag).add(china);

        Goods shoes = new Goods("李宁牌运动鞋", 1, 198f);
        Bag bigBag = new Bag("大袋子");
        bigBag.add(midBag).add(whiteSmallBag).add(shoes);
        float price = bigBag.count();
        System.err.println("以上商品总价："+price+"￥");

    }
}
