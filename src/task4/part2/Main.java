package task4.part2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        TransportAlert alert1 = new TransportAlert(AlertSeverity.DELAY, "Bus delay due to traffic", 101, LocalDate.now(), "Bus 101");
        TransportAlert alert2 = new TransportAlert(AlertSeverity.MAINTENANCE, "Tram under maintenance", 202, LocalDate.now(), "Tram 202");
        TransportAlert alert3 = new TransportAlert(AlertSeverity.ROUTE_CHANGE, "Route changed", 303, LocalDate.now(), "Bus 303");
        TransportController controller = new TransportController();
        AdminNotifier admin1 = new AdminNotifier(101);
        DriverNotifier driver1 = new DriverNotifier("John Doe");
        PassengerNotifier passenger1 = new PassengerNotifier("AppNotification");

        controller.subscribe(admin1);
        controller.subscribe(driver1);
        controller.subscribe(passenger1);
        controller.addAlert(alert1);
        controller.addAlert(alert2);
        controller.addAlert(alert3);
        controller.notifyAlerts();
        controller.addAlert(alert1);
        controller.unsubscribe(admin1);
        controller.notifyAlerts();
    }
}

