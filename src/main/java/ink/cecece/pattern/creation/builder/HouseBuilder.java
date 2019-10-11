package ink.cecece.pattern.creation.builder;

public class HouseBuilder {

    private House house;

    public HouseBuilder(){
        System.out.println("开始建房");
        house = new House();
    }

    public void buildFloor(){
        System.out.println("建造地基、地板");
        house.setFloor(new Floor());
    }

    public void buildWall(){
        System.out.println("建造墙");
        house.setWall(new Wall());
    }

    public void buildDoor(){
        System.out.println("建造门");
        house.setDoor(new Door());
    }

    public void buildWindow(){
        System.out.println("建造窗户");
        house.setWindow(new Window());
    }

    public House getHouse() {
        return house;
    }

    public HouseBuilder setHouse(House house) {
        this.house = house;
        return this;
    }
}
