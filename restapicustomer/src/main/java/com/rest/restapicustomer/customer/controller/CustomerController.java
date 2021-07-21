package com.rest.restapicustomer.customer.controller;

import com.rest.restapicustomer.customer.Customer;
import com.rest.restapicustomer.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(path = "/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    //GET
    @GetMapping
    public List<Customer> getAllCustomers()
    {
        return customerService.getAllCustomers();
    }

    @GetMapping(path = "/{id}")
    public Customer getCustomer(@PathVariable("id") long id)
    {
        return customerService.getCustomerById(id).orElse(null);
    }
    //POST
    @PostMapping
    public int addCustomer(@RequestBody Customer customer)
    {
        return customerService.insertNewCustomer(customer);
    }

    //DELETE
    @DeleteMapping(path = "/{id}")
    public int deleteCustomerById(@PathVariable("id") long id)
    {
        return customerService.deleteCustomerById(id);
    }

    //PUT
    @PutMapping
    public int updateCustomerById(long id, @RequestBody Customer customer)
    {
        return customerService.updateCustomerById(id, customer);
    }


}
