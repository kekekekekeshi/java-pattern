package ink.cecece.pattern.struction.proxy.dynamic;

import org.junit.Test;

public class DynamicProxyTest {

    @Test
    public void test(){

        DynamicProxy proxy = new DynamicProxy();
        Star jackProxy = (Star) proxy.getProxy(Star.class);
        jackProxy.conversation();
        jackProxy.signAContract();
        jackProxy.sing();
        jackProxy.collection();
    }
}
