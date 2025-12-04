package org.bank.bankcoreapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final Map<Integer, String> customers = Map.of(
            1, "Valentyna",
            2, "Vita",
            3, "Galina",
            4, "Oleh",
            5, "Vlada"
    );

    public String getCustomer(Integer id) {
        return customers.get(id);
    }
}

