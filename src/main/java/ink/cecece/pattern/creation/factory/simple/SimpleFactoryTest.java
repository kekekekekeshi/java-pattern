package ink.cecece.pattern.creation.factory.simple;

import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void test(){
        AnimalFactory factory = new AnimalFactory();
        Animal dog = factory.getDog();
        dog.eat();
        Animal cat = factory.getCat();
        cat.eat();
    }
}
