package ink.cecece.pattern.struction.adapter.twowayadapter;

/**
 * 适配者实现类
 */
public class AdapteeRealize implements TwoWayAdaptee {
    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用！");
    }
}
