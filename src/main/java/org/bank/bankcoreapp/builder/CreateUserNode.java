package org.bank.bankcoreapp.builder;

import org.bank.bankcoreapp.shell.Command;
import org.bank.bankcoreapp.shell.Result;

import java.util.Scanner;

public class CreateUserNode implements Command {

    private final Scanner scanner;

    public CreateUserNode(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Result execute() {
        System.out.println("Creating new UserNode...");

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Is active (true/false): ");
        boolean active = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Comment: ");
        String comment = scanner.nextLine();

        UserNode node = UserNodeBuilder.create()
                .name(name)
                .id(id)
                .active(active)
                .comment(comment)
                .build();

        System.out.println("Created node: " + node);
        return Result.CONTINUE;
    }

    @Override
    public String name() {
        return "createNode";
    }
}
