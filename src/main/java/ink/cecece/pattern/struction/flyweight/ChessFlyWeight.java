package ink.cecece.pattern.struction.flyweight;

/**
 * 享元类
 */
public interface ChessFlyWeight {

    void setColor(ChessColorType color);

    ChessColorType getColor();

    void display(Coordinate coordinate);
}
