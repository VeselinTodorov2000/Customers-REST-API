package com.rest.restapicustomer.customer.repository;

import com.rest.restapicustomer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
