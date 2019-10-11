package ink.cecece.pattern.creation.builder;

import org.junit.Test;

public class BuilderTest {

    @Test
    public void test(){

        //建造者
        HouseBuilder builder = new HouseBuilder();
        //指挥者
        HouseDirector director = new HouseDirector(builder);
        //客户需要的产品
        House house = director.build();
        //打印下
        System.out.println(house);
    }
}
