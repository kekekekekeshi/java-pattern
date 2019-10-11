package ink.cecece.pattern.creation.factory.method;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal create() {
        return new Cat();
    }
}
