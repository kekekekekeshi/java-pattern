package ink.cecece.pattern.creation.factory.method;

public class DuckFactory implements AnimalFactory {
    @Override
    public Animal create() {
        return new Duck();
    }
}
