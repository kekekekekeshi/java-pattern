package ink.cecece.pattern.struction.adapter.twowayadapter;

/**
 * 目标实现类
 */
public class TargetRealize implements TwoWayTarget {
    @Override
    public void request() {
        System.out.println("目标代码被调用！");
    }
}
