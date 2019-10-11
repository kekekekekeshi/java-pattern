package ink.cecece.pattern.action.iterator;

public interface Iterator {

    void first();
    void next();
    boolean hasNext();
    boolean isFirst();
    boolean isLast();
    Object getCurrentObject();
}
