package ink.cecece.pattern.struction.proxy.statics;

/**
 * 静态代理
 */
public class Proxy implements Star {

    private Star star;

    public Proxy(Star star){
        this.star = star;
    }

    @Override
    public void conversation() {
        System.out.println("代理交谈");
    }

    @Override
    public void signAContract() {
        System.out.println("代理签约");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collection() {
        System.out.println("代理收款");
    }
}
