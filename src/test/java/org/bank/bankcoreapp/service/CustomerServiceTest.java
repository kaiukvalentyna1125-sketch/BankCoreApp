package org.bank.bankcoreapp.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    private CustomerService customerService;

    @BeforeEach
    void setup() {
        customerService = new CustomerService();
    }

    @Test
    void testGetExistingCustomer() {
        String result = customerService.getCustomer(1);
        assertNotNull(result);
        assertEquals("Valentyna", result);
    }

    @Test
    void testGetAnotherExistingCustomer() {
        String result = customerService.getCustomer(4);
        assertEquals("Oleh", result);
    }

    @Test
    void testGetCustomerNotFound() {
        String result = customerService.getCustomer(999);
        assertNull(result);
    }
}
