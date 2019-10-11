package ink.cecece.pattern.creation.builder;

public class Door {

    private String name = "门";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Door{" +
                "name='" + name + '\'' +
                '}';
    }
}
