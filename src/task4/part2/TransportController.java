package task4.part2;

import java.util.ArrayList;

public class TransportController extends Observable {
    private ArrayList<TransportAlert> alertHistory = new ArrayList<>();

    public void addAlert(TransportAlert alert) {
        alertHistory.add(alert);
    }

    public void notifyAlerts() {
        if (!alertHistory.isEmpty()) {
            for (TransportAlert alert : alertHistory) {
                notifyObservers(alert);
            }
            alertHistory.clear();
        } else {
            System.out.println("No alerts to notify.");
        }
    }
}

