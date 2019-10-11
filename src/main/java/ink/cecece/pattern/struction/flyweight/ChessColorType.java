package ink.cecece.pattern.struction.flyweight;

public enum ChessColorType {

    BLACK("黑色"),WHITE("白色");

    private final String value;

    private ChessColorType(String value){
        this.value = value;
    }

    public String getValue(){

        return value;
    }
}
