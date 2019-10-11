package ink.cecece.pattern.struction.composite;

/**
 * 叶子组件:无子节点
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("叶子节点["+name+"]被访问！");
    }
}
