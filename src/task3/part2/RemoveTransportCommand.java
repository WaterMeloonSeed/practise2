package task3.part2;

public class RemoveTransportCommand extends AbstractCommand {
    private String transportName;

    public RemoveTransportCommand(String transportName) {
        this.transportName = transportName;
    }

    @Override
    public void execute() {
        System.out.println("Transport " + transportName + " has been removed from service.");
    }

    @Override
    public void undo() {
        System.out.println("Transport " + transportName + " has been reinstated.");
    }

    @Override
    public String toString() {
        return "RemoveTransportCommand{" +
                "transportName='" + transportName + '\'' +
                '}';
    }
}
