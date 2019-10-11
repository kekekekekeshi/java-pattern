package ink.cecece.pattern.creation.singleton;

/**
 * 静态内部类单例模式
 */
public class StaticInternalClassSingleton {

    /**
     * 私有化构造器
     */
    private StaticInternalClassSingleton(){}

    /**
     * 静态内部类
     */
    private static class Singleton {
        private static final StaticInternalClassSingleton STATIC_INTERNAL_CLASS_SINGLETON = new StaticInternalClassSingleton();
    }

    /**
     * 全局访问点
     * @return
     */
    public static StaticInternalClassSingleton newInstance(){

        return Singleton.STATIC_INTERNAL_CLASS_SINGLETON;
    }

    public void show(){
        System.out.println("静态内部类单例模式");
    }
}
