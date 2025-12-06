package org.bank.bankcoreapp;

import lombok.extern.slf4j.Slf4j;
import org.bank.bankcoreapp.builder.CreateUserNode;
import org.bank.bankcoreapp.shell.Exit;
import org.bank.bankcoreapp.shell.Help;
import org.bank.bankcoreapp.shell.Menu;
import org.bank.bankcoreapp.shell.Return;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
@Slf4j
public class BankCoreAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankCoreAppApplication.class, args);

        Scanner scanner = new Scanner(System.in);

        Menu main = new Menu("main", scanner);
        Return returnCmd = new Return();
        Exit exitCmd = new Exit();
        Help helpMain = new Help("Main menu help info");

        main.add(helpMain);
        main.add(returnCmd);
        main.add(exitCmd);

        Menu userMenu = new Menu("user", scanner);
        userMenu.add(returnCmd);
        userMenu.add(exitCmd);
        userMenu.add(new Help("Menu for creating UserNodes"));
        userMenu.add(new CreateUserNode(scanner));

        main.add(userMenu);

        main.execute();
    }
}

