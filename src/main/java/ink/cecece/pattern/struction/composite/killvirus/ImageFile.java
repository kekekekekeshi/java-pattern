package ink.cecece.pattern.struction.composite.killvirus;

/**
 * 叶子组件
 */
public class ImageFile implements AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--------->图片文件:"+name+",进行查杀！");
    }
}
