package behavioral_patterns.comand;

import java.util.ArrayDeque;
import java.util.Deque;

public class MarketplaceUI {
    private final Deque<Command> commands = new ArrayDeque<>();

    public void executeCommand(Command command) {
        commands.push(command);
        command.execute();
    }

    public void undoLastCommand() {
        if (commands.isEmpty()) {
            System.out.println("No more commands to undo");
            return;
        }
        Command lastCommand = commands.pop();
        lastCommand.undo();
    }
}
