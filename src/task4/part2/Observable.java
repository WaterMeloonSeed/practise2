package task4.part2;

import java.util.ArrayList;

public abstract class Observable {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void notifyObservers(TransportAlert alert) {
        for (Observer observer : observers) {
            observer.notify(alert);
        }
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
}
