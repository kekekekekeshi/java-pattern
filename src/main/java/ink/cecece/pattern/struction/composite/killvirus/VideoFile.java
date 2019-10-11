package ink.cecece.pattern.struction.composite.killvirus;

/**
 * 叶子组件
 */
public class VideoFile implements AbstractFile {

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--------->视频文件:"+name+",进行查杀！");
    }
}
