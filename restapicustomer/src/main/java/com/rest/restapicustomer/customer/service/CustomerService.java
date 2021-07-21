package com.rest.restapicustomer.customer.service;

import com.rest.restapicustomer.customer.Customer;
import com.rest.restapicustomer.customer.db.CustomerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerDB customerDB;

    @Autowired
    public CustomerService(@Qualifier("postgresql")CustomerDB customerDB) {
        this.customerDB = customerDB;
    }

    public List<Customer> getAllCustomers()
    {
        return customerDB.getCustomers();
    }
    public Optional<Customer> getCustomerById(long id)
    {
        return customerDB.getCustomer(id);
    }

    public int insertNewCustomer(Customer customer)
    {
        return customerDB.insertCustomer(customer);
    }

    public int deleteCustomerById(long id)
    {
        return customerDB.deleteCustomerById(id);
    }

    public int updateCustomerById(long id, Customer customer)
    {
        return customerDB.updateCustomerById(id, customer);
    }
}
