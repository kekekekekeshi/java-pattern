package ink.cecece.pattern.struction.proxy.statics;

import org.junit.Test;

public class StaticProxyTest {

    @Test
    public void test(){
        Star jack = new Jack();
        Proxy proxy = new Proxy(jack);
        proxy.conversation();
        proxy.signAContract();
        proxy.sing();
        proxy.collection();
    }
}
