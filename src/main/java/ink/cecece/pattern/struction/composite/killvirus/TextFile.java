package ink.cecece.pattern.struction.composite.killvirus;

/**
 * 叶子组件
 */
public class TextFile implements AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--------->文本文件:"+name+",进行查杀！");
    }
}
