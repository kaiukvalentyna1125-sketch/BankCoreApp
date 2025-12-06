package org.bank.bankcoreapp.shell;

public interface Command {
    Result execute();
    String name();
}
