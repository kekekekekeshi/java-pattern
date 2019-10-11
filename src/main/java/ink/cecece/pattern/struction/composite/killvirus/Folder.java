package ink.cecece.pattern.struction.composite.killvirus;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器组件
 */
public class Folder implements AbstractFile {

    private String name;
    //定义容器
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public Folder add(AbstractFile file){
        list.add(file);
        return this;
    }

    public void remove(AbstractFile file){
        list.remove(file);
    }

    public AbstractFile getChild(int idx){
        return list.get(idx);
    }

    @Override
    public void killVirus() {
        System.out.println("--------->文件夹:"+name+",进行查杀！");

        for (AbstractFile file : list){
            file.killVirus();
        }
    }
}
