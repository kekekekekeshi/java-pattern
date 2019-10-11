package ink.cecece.pattern.creation.factory.method;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal create() {
        return new Dog();
    }
}
