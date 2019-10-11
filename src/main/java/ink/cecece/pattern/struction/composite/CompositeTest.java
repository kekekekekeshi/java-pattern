package ink.cecece.pattern.struction.composite;

import org.junit.Test;

/**
 * 组合模式
 *      - 用于处理树形结构
 *      - 有时又叫作部分-整体模式，它是一种将对象组合成树状的层次结构的模式，用来表示“部分-整体”的关系，使用户对单个对象和组合对象具有一致的访问性
 * 优点
 *      - 组合模式使得客户端代码可以一致地处理单个对象和组合对象，无须关心自己处理的是单个对象，还是组合对象，这简化了客户端代码；
 *      - 更容易在组合体内加入新的对象，客户端不会因为加入了新的对象而更改源代码，满足“开闭原则”；
 * 缺点
 *      - 设计较复杂，客户端需要花更多时间理清类之间的层次关系；
 *      - 不容易限制容器中的构件；
 *      - 不容易用继承的方法来增加构件的新功能
 * 结构
 *      - 抽象组件：定义公共的行为
 *      - 叶子组件：继承自抽象组件，为叶子节点，没有子节点
 *      - 树枝组件：继承自抽象组件，为树枝节点，可以有许多子节点，通常包含容器成员、添加、移除、获得子节点的行为。用于存储和管理子组件。
 * example:访问tc0={leaf1,c1={leaf2,leaf3}}
 */
public class CompositeTest {

    @Test
    public void test(){

        Composite c0 = new Composite("c0");
        Composite c1 = new Composite("c1");
        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");
        Leaf leaf3 = new Leaf("leaf3");
        c1.add(leaf2).add(leaf3);
        c0.add(leaf1).add(c1);
        c0.operation();
    }
}
