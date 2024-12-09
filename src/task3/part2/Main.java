package task3.part2;

public class Main {
    public static void main(String[] args){
        TransportController tc = new TransportController();

        StopTransportCommand stop1 = new StopTransportCommand("Bus 101");
        StopTransportCommand stop2 = new StopTransportCommand("Tram 202");
        ChangeRouteCommand change1 = new ChangeRouteCommand("Bus 101", "Route A -> Route B");
        ChangeRouteCommand change2 = new ChangeRouteCommand("Tram 202", "Route X -> Route Y");
        RemoveTransportCommand remove1 = new RemoveTransportCommand("Bus 303");
        RemoveTransportCommand remove2 = new RemoveTransportCommand("Tram 404");

        stop1.execute();
        change1.execute();
        remove1.execute();
        remove2.execute();
        stop2.undo();

        tc.addCommand(stop1);
        tc.addCommand(change1);
        tc.addCommand(remove1);
        tc.addCommand(remove2);
        tc.addCommand(stop2);

        tc.executeAllPendingCommands();
        System.out.println(tc.getCommandHistory());

        change2.execute();
        change2.undo();
        tc.undoChanges(1);
        change2.execute();
        tc.removeCommand(change2);
        tc.addCommand(change2);
        stop2.execute();
        tc.addCommand(stop2);
        tc.undoCommand(stop2);
        tc.executeAllPendingCommands();
        System.out.println(tc.getCommandHistory());
    }
}

