package task4.part2;

public class PassengerNotifier implements Observer {
    private String notificationChannel;

    public PassengerNotifier(String notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    @Override
    public void notify(TransportAlert alert) {
        System.out.println("Passengers notified via " + notificationChannel + ": " + alert.toString());
    }
}

