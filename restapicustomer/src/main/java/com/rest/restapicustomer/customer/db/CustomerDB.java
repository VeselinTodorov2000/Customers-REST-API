package com.rest.restapicustomer.customer.db;

import com.rest.restapicustomer.customer.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("postgresql")
public class CustomerDB implements dbProps
{
    private static List<Customer> customers = new ArrayList<>();

    @Override
    public int insertCustomer(Customer customer) {
        customers.add(customer);
        return 1;
    }

    @Override
    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> getCustomer(long id) {
        return customers.stream().filter(customer -> customer.getId().equals(id)).findFirst();
    }

    @Override
    public int deleteCustomerById(long id) {
        Optional<Customer> exist = getCustomer(id);
        if(exist.isEmpty())
        {
            return 0;
        }
        customers.remove(exist.get());
        return 1;
    }

    @Override
    public int updateCustomerById(long id, Customer customer) {
        return getCustomer(id).map(c -> {
            int indexOfCustomer = customers.indexOf(c);
            if(!(indexOfCustomer < 0))
            {
                customers.set(indexOfCustomer, customer);
                return 1;
            }
            return 0;
        }).orElse(0);
    }


}
