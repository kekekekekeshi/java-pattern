package ink.cecece.pattern.creation.factory.simple;

/**
 * 动物工厂
 */
public class AnimalFactory {

    public Animal create(AnimalType type){
        if(type.equals(AnimalType.DOG))
            return this.getDog();
        else if(type.equals(AnimalType.CAT))
            return this.getCat();
        else
            return null;
    }

    public Animal getDog(){
        return new Dog();
    }

    public Animal getCat(){
        return new Cat();
    }
}
