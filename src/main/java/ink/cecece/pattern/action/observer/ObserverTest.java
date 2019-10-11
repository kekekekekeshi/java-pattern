package ink.cecece.pattern.action.observer;

import org.junit.Test;

/**
 * 观察者模式
 * 结构
 *      - 抽象主题
 *      - 具体主题
 *      - 抽象观察者
 *      - 具体观察者
 */
public class ObserverTest {

    @Test
    public void test(){

        Subject subject = new ConcreteSubject();
        Observer observerA = new ConcreteObserver("A");
        Observer observerB = new ConcreteObserver("B");
        Observer observerC = new ConcreteObserver("C");
        Observer observerD = new ConcreteObserver("D");
        subject.add(observerA).add(observerB).add(observerC).add(observerD);
        subject.notifyObserver();
    }
}
