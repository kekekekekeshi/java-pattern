package ink.cecece.pattern.creation.builder;

public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder){

        this.houseBuilder = houseBuilder;
    }

    public House build(){
        houseBuilder.buildFloor();
        houseBuilder.buildWall();
        houseBuilder.buildDoor();
        houseBuilder.buildWindow();
        System.out.println("房屋建造完成");
        return houseBuilder.getHouse();
    }
}
