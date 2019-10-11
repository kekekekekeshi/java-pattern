package ink.cecece.pattern.struction.proxy.statics;

public class Jack implements Star {

    @Override
    public void conversation() {
        System.out.println("Jack交谈");
    }

    @Override
    public void signAContract() {
        System.out.println("Jack签约");
    }

    @Override
    public void sing() {
        System.out.println("Jack唱歌");
    }

    @Override
    public void collection() {
        System.out.println("Jack收款");
    }
}
