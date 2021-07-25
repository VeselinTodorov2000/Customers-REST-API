package com.rest.restapicustomer.customer.db;

import com.rest.restapicustomer.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("postgresql")
public class CustomerDB
{
    private dbProps customers;

    @Autowired
    public CustomerDB(dbProps customers) {
        this.customers = customers;
    }

    public int insertCustomer(Customer customer) {
        customers.save(customer);
        return 1;
    }

    public List<Customer> getCustomers() {
        return customers.findAll();
    }

    public Optional<Customer> getCustomer(long id) {
        return customers.findById(id);
    }

    public int deleteCustomerById(long id) {
        customers.deleteById(id);
        return 1;
    }

    public int updateCustomerById(long id, Customer customer) {
        customers.deleteById(id);
        customers.save(customer);
        return 1;
    }
}
