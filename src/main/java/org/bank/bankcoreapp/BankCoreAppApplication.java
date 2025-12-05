package org.bank.bankcoreapp;

import lombok.extern.slf4j.Slf4j;
import org.bank.bankcoreapp.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
@Slf4j
public class BankCoreAppApplication {

    private static final CustomerService customerService = new CustomerService(
            Map.of(1, "Valentyna", 2, "Vita", 3, "Olena")
    );

    public static void main(String[] args) {
        log.info("Application is starting...");
        System.out.println("\nHello! It is a new project!!!");

        log.info("Let's test our code:");
        log.info("User[1] = " + customerService.getCustomer(0));
        log.info("User[2] = " + customerService.getCustomer(1));
        log.info("User[3] = " + customerService.getCustomer(2));

        SpringApplication.run(BankCoreAppApplication.class, args);
        log.info("Application started successfully!");
    }

}
