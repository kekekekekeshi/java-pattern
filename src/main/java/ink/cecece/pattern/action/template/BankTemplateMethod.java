package ink.cecece.pattern.action.template;

public abstract class BankTemplateMethod {

    /**
     * 取号
     */
    public void takeNumber(){
        System.out.println("排队取号");
    }

    /**
     * 办理业务
     */
    public abstract void transact();

    /**
     * 评价
     */
    public void evaluate(){
        System.out.println("反馈评价");
    }

    /**
     * 算法骨架
     */
    public final void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
