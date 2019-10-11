package ink.cecece.pattern.creation.singleton;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void testDisabledLazyLoadingSingleton(){
        DisabledLazyLoadingSingleton.newInstance().show();
    }

    @Test
    public void  testEnabledLazyLoadingSingleton(){
        EnabledLazyLoadingSingleton.newInstance().show();
    }

    @Test
    public void testDoubleLockSingleton(){
        DoubleLockSingleton.newInstance().show();
    }

    @Test
    public void testEnumSingleton(){
        EnumSingleton.NEWINSTANCCE.show();
    }

    @Test
    public void testStaticInternalClassSingleton(){
        StaticInternalClassSingleton.newInstance().show();
    }
}
