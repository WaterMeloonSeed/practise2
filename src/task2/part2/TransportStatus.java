package task2.part2;

public class TransportStatus {
    private boolean isOnRoute;
    private boolean isAvailable;
    private boolean requiresMaintenance;

    public TransportStatus(boolean isOnRoute, boolean isAvailable, boolean requiresMaintenance) {
        this.isOnRoute = isOnRoute;
        this.isAvailable = isAvailable;
        this.requiresMaintenance = requiresMaintenance;
    }

    public boolean isOnRoute() {
        return isOnRoute;
    }

    public void setOnRoute(boolean onRoute) {
        isOnRoute = onRoute;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean requiresMaintenance() {
        return requiresMaintenance;
    }

    public void setRequiresMaintenance(boolean requiresMaintenance) {
        this.requiresMaintenance = requiresMaintenance;
    }
}
