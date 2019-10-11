package ink.cecece.pattern.struction.proxy.dynamic.cglib;

import ink.cecece.pattern.struction.proxy.statics.Jack;
import org.junit.Test;

public class CGLIBProxyTest {

    @Test
    public void test(){

        CGLIBProxy proxy = new CGLIBProxy();
        Star jack = (Star) proxy.getProxy(Star.class);
        jack.conversation();
        jack.signAContract();
        jack.sing();
        jack.collection();
    }
}
