package ink.cecece.pattern.struction.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 静态代理
 */
public class DynamicProxy<T> implements InvocationHandler {

    //真实对象
    private Class<T> target;

    /**
     * 建立真实对象和代理对象的联系
     * @param target
     * @return
     */
    public Object getProxy(Class<T> target){
        this.target = target;
        //加上泛型，可以将接口直接传过来然后所有的实现均在invoke方法中实现
        return Proxy.newProxyInstance(getClass().getClassLoader(), new Class[] { target }, this);
    }

    /**
     * 具体的代理处理
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("======================================");
        System.out.println("进入代理逻辑方法");
        System.out.println("调度真实对象之前");
        if(method.getName().equals("conversation"))
            System.out.println("代理交谈");
        else if(method.getName().equals("signAContract"))
            System.out.println("代理签约");
        else if(method.getName().equals("sing"))
            /*method.invoke(target, args);*/
            System.out.println("Jack唱歌");
        else if(method.getName().equals("collection"))
            System.out.println("代理收款");
        System.out.println("调度真实对象之后");
        return target;
    }
}
