package ink.cecece.pattern.creation.builder;

public class House {

    private Floor floor;
    private Wall wall;
    private Door door;
    private Window window;

    public Floor getFloor() {
        return floor;
    }

    public House setFloor(Floor floor) {
        this.floor = floor;
        return this;
    }

    public Wall getWall() {
        return wall;
    }

    public House setWall(Wall wall) {
        this.wall = wall;
        return this;
    }

    public Door getDoor() {
        return door;
    }

    public House setDoor(Door door) {
        this.door = door;
        return this;
    }

    public Window getWindow() {
        return window;
    }

    public House setWindow(Window window) {
        this.window = window;
        return this;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor=" + floor +
                ", wall=" + wall +
                ", door=" + door +
                ", window=" + window +
                '}';
    }
}
