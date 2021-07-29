package com.rest.restapicustomer.customer.service;

import com.rest.restapicustomer.model.Customer;
import com.rest.restapicustomer.customer.repository.CustomerRepository;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerDB;

    @Autowired
    public CustomerService(CustomerRepository customerDB)
    {
        this.customerDB = customerDB;
    }

    public List<Customer> getAllCustomers()
    {
        return customerDB.findAll();
    }

    public Optional<Customer> getCustomerById(long id)
    {
        return customerDB.findById(id);
    }

    public int insertNewCustomer(Customer customer)
    {
        customerDB.save(customer);
        return 1;
    }

    public int deleteCustomerById(long id)
    {
        customerDB.deleteById(id);
        return 1;
    }

    public int updateCustomerById(Customer customer)
    {
        Optional<Customer> customerToUpdate = customerDB.findById(customer.getId());
        if(customerToUpdate.isEmpty())
        {
            return 0;
        }
        Customer updatedCustomer = customerToUpdate.get();
        updatedCustomer.setName(customer.getName());
        updatedCustomer.setCreationDate(customer.getCreationDate());
        updatedCustomer.setPurchasedItems(customer.getPurchasedItems());
        customerDB.save(updatedCustomer);
        return 1;
    }
}
