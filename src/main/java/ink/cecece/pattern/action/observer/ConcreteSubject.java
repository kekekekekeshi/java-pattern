package ink.cecece.pattern.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的主题
 */
public class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver() {
        observers.forEach(item -> {
            item.response();
        });
    }
}
