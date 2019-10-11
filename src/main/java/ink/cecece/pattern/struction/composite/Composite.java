package ink.cecece.pattern.struction.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器组件/树枝组件
 */
public class Composite implements Component {

    private String name;
    //定义容器
    private List<Component> list = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    //添加
    public Composite add(Component component){
        list.add(component);
        return this;
    }

    //移除
    public void remove(Component component){
        list.remove(component);
    }

    //获取i子组件
    public Component getChild(int idx){
        return list.get(idx);
    }

    @Override
    public void operation() {
        System.out.println("树枝节点["+name+"]被访问！");
        list.forEach(item->{
            item.operation();
        });
    }
}
