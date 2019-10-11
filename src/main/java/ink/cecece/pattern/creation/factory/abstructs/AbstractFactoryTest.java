package ink.cecece.pattern.creation.factory.abstructs;

import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void test(){
        NorthAnimalFactory northAnimalFactory = new NorthAnimalFactory();
        Animal northDog = northAnimalFactory.getDog();
        northDog.eat();
        Animal northCat = northAnimalFactory.getCat();
        northCat.eat();
        SouthAnimalFactory southAnimalFactory = new SouthAnimalFactory();
        Animal southDog = southAnimalFactory.getDog();
        southDog.eat();
        Animal southCat = southAnimalFactory.getCat();
        southCat.eat();
    }
}
