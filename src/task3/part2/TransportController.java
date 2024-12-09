package task3.part2;

import java.util.ArrayList;

public class TransportController {
    private ArrayList<AbstractCommand> commandsToExecute = new ArrayList<>();
    private ArrayList<AbstractCommand> commandHistory = new ArrayList<>();

    public void addCommand(AbstractCommand command) {
        commandsToExecute.add(command);
    }

    public void removeCommand(AbstractCommand command) {
        commandsToExecute.removeIf(com -> com.equals(command));
    }

    public void undoCommand(AbstractCommand command) {
        commandHistory.removeIf(com -> com.equals(command));
    }

    public void executeAllPendingCommands() {
        for (AbstractCommand command : commandsToExecute) {
            commandHistory.add(command);
            command.execute();
        }
        commandsToExecute.clear();
    }

    public void undoChanges(int changesToUndo) {
        for (int i = 0; i < changesToUndo; i++) {
            if (!commandHistory.isEmpty()) {
                commandHistory.remove(commandHistory.size() - 1);
            }
        }
    }

    public ArrayList<AbstractCommand> getCommandHistory() {
        return commandHistory;
    }
}

