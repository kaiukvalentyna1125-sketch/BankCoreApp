package org.bank.bankcoreapp.shell;

public class Exit implements Command {

    @Override
    public Result execute() {
        System.out.println("Exiting program...");
        return Result.EXIT;
    }

    @Override
    public String name() {
        return "exit";
    }
}
