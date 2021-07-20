package com.rest.restapicustomer.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/api/customer")
public class Controller {

    private final Service customerService;

    @Autowired
    public Controller(Service customerService) {
        this.customerService = customerService;
    }

    //GET
    @GetMapping
    public List<Customer> getAllCustomers()
    {
        return customerService.getAllCustomers();
    }

    //POST

    //PUT

    //DELETE
}
