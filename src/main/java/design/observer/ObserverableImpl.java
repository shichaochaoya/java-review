package design.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverableImpl implements Observerable {
    private List<Observer> obs;
    private String message;

    public ObserverableImpl() {
        obs = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer o) {
        obs.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!obs.isEmpty()) {
            obs.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o : obs) {
            o.update(message);
        }
    }


    public void setInformation(String s) {
        this.message = s;
        System.out.println("被观察者更新消息: " + s);
        notifyObserver();
    }

}

