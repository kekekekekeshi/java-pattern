package ink.cecece.pattern.struction.facade;

/**
 * 外观角色
 */
public class Facade {

    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;

    public Facade(){
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
    }

    /**
     * 使用外观角色跟子系统去打交道，客户只需要跟外观角色打交道
     */
    public void doAction(){
        subSystem1.doAction();
        subSystem2.doAction();
    }
}
