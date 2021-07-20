package com.rest.restapicustomer.customer;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    public List<Customer> getAllCustomers()
    {
        return List.of(
                new Customer(1L, "Petar Petrov",LocalDate.now(), 10),
                new Customer(2L, "Ivan Ivanov", LocalDate.of(2020, 4, 10), 15)
        );
    }
}
