package ink.cecece.pattern.creation.singleton;

/**
 * 饿汉式单例模式
 */
public class DisabledLazyLoadingSingleton {

    //直接实例化
    private static final DisabledLazyLoadingSingleton DISABLED_LAZY_LOADING_SINGLETON = new DisabledLazyLoadingSingleton();

    /**
     * 私有化构造器
     */
    private DisabledLazyLoadingSingleton(){}

    /**
     * 全局访问点
     * @return
     */
    public static DisabledLazyLoadingSingleton newInstance(){
        return DISABLED_LAZY_LOADING_SINGLETON;
    }

    public void show(){
        System.out.println("饿汉式单例模式");
    }
}
