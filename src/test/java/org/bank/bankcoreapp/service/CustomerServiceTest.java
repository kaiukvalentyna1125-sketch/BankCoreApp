package org.bank.bankcoreapp.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.mockito.ArgumentCaptor;

import java.util.Map;

import static org.mockito.Mockito.*;


class CustomerServiceTest {

    private CustomerService customerService;
    private Map<Integer, String> mapMock;

    @BeforeEach
    void setup() {
        mapMock = mock(Map.class);
        customerService = new CustomerService(mapMock);
    }

    @Test
    void testGetExistingCustomer() {
        when(mapMock.get(1)).thenReturn("Valentyna");

        String result = customerService.getCustomer(1);

        assertEquals("Valentyna", result);

        ArgumentCaptor<Integer> idCaptor = ArgumentCaptor.forClass(Integer.class);
        verify(mapMock).get(idCaptor.capture());

        assertEquals(1, idCaptor.getValue());
    }

    @Test
    void testGetCustomerNotFound() {
        when(mapMock.get(999)).thenReturn(null);

        String result = customerService.getCustomer(999);

        assertNull(result);
        verify(mapMock).get(999);
    }
}