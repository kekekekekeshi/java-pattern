package ink.cecece.pattern.struction.flyweight;

import org.junit.Test;

/**
 * 享元模式
 *      - 内部状态：可以共享的部分,通过享元类享元池处理
 *      - 外部状态：不可共享的部分,通过外部单独传入
 * 优点：
 *      - 极大减少内存中对象的数量
 *      - 相同或相似对象内存中只有一份，节约内存空间，提升系统性能
 *      - 外部状态相对独立，不影响内部状态
 *  缺点：
 *      - 模式较复杂，使程序逻辑复杂化
 *      - 为节省内存，共享内部状态，分离外部状态，而读取外部状态使得运行时间变长，以时间换空间。
 */
public class FlyWeightTest {

    @Test
    public void test(){

        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess(ChessColorType.BLACK);
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess(ChessColorType.BLACK);
        System.out.println("测试享元池中的对象是否是共享的：" + (chess1 == chess2));

        System.out.println("增加外部状态");
        chess1.display(new Coordinate(10, 200));
        chess2.display(new Coordinate(15, 36));
    }
}
