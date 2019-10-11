package ink.cecece.pattern.struction.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 实现CGLIB库中的MethodInterceptor
 */
public class CGLIBProxy<T> implements MethodInterceptor {

    private Class<T> target;

    public T getProxy(Class<T> target){
        //CGLIB增强类对象
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target);
        //定义代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor方法
        enhancer.setCallback(this);
        //生成并返回代理对象
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("======================================");
        System.out.println("调用真实对象前");
        if(method.getName().equals("conversation"))
            System.out.println("代理交谈");
        else if(method.getName().equals("signAContract"))
            System.out.println("代理签约");
        else if(method.getName().equals("sing"))
            System.out.println("Jack唱歌");
        else if(method.getName().equals("collection"))
            System.out.println("代理收款");
        System.out.println("调度真实对象之后");
        System.out.println("调用真实对象后");

        //CGLIB反射调用真实对象方法
//        return methodProxy.invokeSuper(o, objects);
        return target;
    }
}
