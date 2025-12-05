package org.bank.bankcoreapp.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class CustomerService {

    private final Map<Integer, String> customers;

    public CustomerService() {
        this.customers = Map.of(
                1, "Valentyna",
                2, "Vita",
                3, "Galina",
                4, "Oleh",
                5, "Vlada"
        );
    }

    public CustomerService(Map<Integer, String> customers) {
        this.customers = customers;
    }

    public String getCustomer(Integer id) {
        log.info("Request for customer with id = {}", id);

        String result = customers.get(id);

        if (result == null) {
            log.warn("Customer with id {} not found", id);
        } else {
            log.debug("Customer found: {}", result);
        }

        return result;
    }
}

