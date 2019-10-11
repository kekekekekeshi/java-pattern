package ink.cecece.pattern.action.observer;

/**
 * 具体观察者
 */
public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void response() {
        System.out.println("观察者："+name+"作出了回应！");
    }
}
