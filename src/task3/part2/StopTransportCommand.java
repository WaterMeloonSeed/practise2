package task3.part2;

public class StopTransportCommand extends AbstractCommand {
    private String transportName;

    public StopTransportCommand(String transportName) {
        this.transportName = transportName;
    }

    @Override
    public void execute() {
        System.out.println("Transport " + transportName + " has been stopped.");
    }

    @Override
    public void undo() {
        System.out.println("Transport " + transportName + " has been resumed.");
    }

    @Override
    public String toString() {
        return "StopTransportCommand{" +
                "transportName='" + transportName + '\'' +
                '}';
    }
}

