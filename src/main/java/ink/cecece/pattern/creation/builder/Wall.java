package ink.cecece.pattern.creation.builder;

public class Wall {

    private String name = "墙";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "name='" + name + '\'' +
                '}';
    }
}
