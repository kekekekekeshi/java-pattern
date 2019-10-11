package ink.cecece.pattern.creation.factory.method;

import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void test(){
        CatFactory catFactory = new CatFactory();
        Animal cat = catFactory.create();
        cat.eat();
        DogFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.create();
        dog.eat();
        DuckFactory duckFactory = new DuckFactory();
        Animal duck = duckFactory.create();
        duck.eat();
    }
}
