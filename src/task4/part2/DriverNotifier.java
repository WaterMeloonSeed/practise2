package task4.part2;

public class DriverNotifier implements Observer {
    private String driverName;

    public DriverNotifier(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public void notify(TransportAlert alert) {
        System.out.println("Driver " + driverName + " notified: " + alert.toString());
    }
}

