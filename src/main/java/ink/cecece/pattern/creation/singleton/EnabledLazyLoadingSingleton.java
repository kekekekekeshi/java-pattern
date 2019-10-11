package ink.cecece.pattern.creation.singleton;

/**
 * 懒汉式单例模式
 */
public class EnabledLazyLoadingSingleton {

    private static EnabledLazyLoadingSingleton enabledLazyLoadingSingleton = null;

    /**
     * 私有化构造器
     */
    private EnabledLazyLoadingSingleton(){}

    /**
     * 全局访问点
     * @return
     */
    public static EnabledLazyLoadingSingleton newInstance(){
        //需要使用时才创建
        if(enabledLazyLoadingSingleton == null)
            enabledLazyLoadingSingleton = new EnabledLazyLoadingSingleton();

        return enabledLazyLoadingSingleton;
    }

    public void show(){
        System.out.println("懒汉式单例模式");
    }
}
