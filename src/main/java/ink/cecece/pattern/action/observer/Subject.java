package ink.cecece.pattern.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    /**
     * 将观察者添加进来
     * @param observer
     * @return
     */
    public Subject add(Observer observer){
        observers.add(observer);
        return this;
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void remove(Observer observer){
        observers.remove(observer);
    }

    /**
     * 统一通知所有的观察者
     */
    public abstract void notifyObserver();
}
