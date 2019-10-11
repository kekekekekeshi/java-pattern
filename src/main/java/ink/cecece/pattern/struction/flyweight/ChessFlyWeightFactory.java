package ink.cecece.pattern.struction.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 */
public class ChessFlyWeightFactory {

    //享元池
    private static Map<ChessColorType, ChessFlyWeight> map = new HashMap<>();

    public static  ChessFlyWeight getChess(ChessColorType color){
        if(map.get(color)==null){
            ConcreteChess concreteChess = new ConcreteChess(color);
            map.put(color, concreteChess);
        }
        return map.get(color);
    }

}
