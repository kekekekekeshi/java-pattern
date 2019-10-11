package ink.cecece.pattern.struction.flyweight;

/**
 * 具体享元对象：为内部成员变量提供存储
 */
public class ConcreteChess implements ChessFlyWeight {

    private ChessColorType color;

    public ConcreteChess(ChessColorType color) {
        this.color = color;
    }

    @Override
    public void setColor(ChessColorType color) {
        this.color = color;
    }

    @Override
    public ChessColorType getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("[棋子颜色:"+color.getValue()+",位置:"+coordinate+"]");
    }
}
