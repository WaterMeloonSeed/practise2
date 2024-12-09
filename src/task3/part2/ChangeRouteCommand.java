package task3.part2;

public class ChangeRouteCommand extends AbstractCommand {
    private String transportName;
    private String newRoute;

    public ChangeRouteCommand(String transportName, String newRoute) {
        this.transportName = transportName;
        this.newRoute = newRoute;
    }

    @Override
    public void execute() {
        System.out.println("Transport " + transportName + " route changed to: " + newRoute);
    }

    @Override
    public void undo() {
        System.out.println("Route change for " + transportName + " has been reverted.");
    }

    @Override
    public String toString() {
        return "ChangeRouteCommand{" +
                "transportName='" + transportName + '\'' +
                ", newRoute='" + newRoute + '\'' +
                '}';
    }
}

