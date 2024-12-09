package task4.part2;

public class AdminNotifier implements Observer {
    private int transportNumber;

    public AdminNotifier(int transportNumber) {
        this.transportNumber = transportNumber;
    }

    @Override
    public void notify(TransportAlert alert) {
        System.out.println("Admin notified for transport number " + transportNumber + ": " + alert.toString());
    }
}

