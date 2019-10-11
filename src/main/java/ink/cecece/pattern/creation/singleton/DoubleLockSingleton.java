package ink.cecece.pattern.creation.singleton;

/**
 * 双重锁式单例模式
 */
public class DoubleLockSingleton {

    private static DoubleLockSingleton doubleLockSingleton = null;

    /**
     * 私有化构造器
     */
    private DoubleLockSingleton(){}

    /**
     * 全局访问点
     * @return
     */
    public static DoubleLockSingleton newInstance(){

        if(doubleLockSingleton == null){
            DoubleLockSingleton doubleLockSingletonTemp = null;
            synchronized (DoubleLockSingleton.class){
                doubleLockSingletonTemp = doubleLockSingleton;
                if(doubleLockSingletonTemp == null){
                    synchronized (DoubleLockSingleton.class){
                        doubleLockSingletonTemp = new DoubleLockSingleton();
                    }
                }
                doubleLockSingleton = doubleLockSingletonTemp;
            }
        }

        return doubleLockSingleton;
    }

    public void show(){
        System.out.println("双重锁式单例模式");
    }
}
