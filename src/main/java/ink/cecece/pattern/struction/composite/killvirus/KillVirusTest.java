package ink.cecece.pattern.struction.composite.killvirus;

import org.junit.Test;

public class KillVirusTest {

    @Test
    public void test(){
        AbstractFile  f2, f3, f4, f5;
        Folder f1 = new Folder("我的收藏");
        f2 = new ImageFile("123.png");
        f3 = new VideoFile("av.avi");
        f4 = new TextFile("cc.txt");
        f1.add(f2).add(f3).add(f4);
        f1.killVirus();
    }
}
