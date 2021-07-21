package com.rest.restapicustomer.customer.db;

import com.rest.restapicustomer.customer.Customer;

import java.util.List;
import java.util.Optional;

public interface dbProps {
    int insertCustomer(Customer customer);
    List<Customer> getCustomers();
    Optional<Customer> getCustomer(long id);
    int deleteCustomerById(long id);
    int updateCustomerById(long id, Customer customer);
}
