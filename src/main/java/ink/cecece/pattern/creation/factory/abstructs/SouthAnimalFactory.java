package ink.cecece.pattern.creation.factory.abstructs;

public class SouthAnimalFactory implements AnimalFactory {

    @Override
    public Animal getDog() {
        System.out.println("南方的");
        return new Dog();
    }

    @Override
    public Animal getCat() {
        System.out.println("南方的");
        return new Cat();
    }
}
