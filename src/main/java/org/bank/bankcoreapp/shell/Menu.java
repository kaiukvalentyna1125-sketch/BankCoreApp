package org.bank.bankcoreapp.shell;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu implements Command {

    private final String name;
    private final Scanner scanner;
    private final Map<String, Command> commands = new HashMap<>();

    public Menu(String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    @Override
    public Result execute() {
        if (commands.isEmpty()) {
            System.out.println("Menu is empty.");
            return Result.CONTINUE;
        }

        Result result;
        do {
            prompt();
            String input = scanner.nextLine();
            Command cmd = commands.get(input);

            if (cmd != null) {
                result = cmd.execute();
            } else {
                System.out.println("Unknown command. Try again.");
                result = Result.CONTINUE;
            }
        } while (result == Result.CONTINUE);

        return result == Result.EXIT ? Result.EXIT : Result.CONTINUE;
    }

    @Override
    public String name() {
        return name;
    }

    public void add(Command command) {
        commands.put(command.name(), command);
    }

    private void prompt() {
        String commandNames = String.join(", ", commands.keySet());
        System.out.println("\nCommands available: " + commandNames);
        System.out.print("> ");
    }
}
