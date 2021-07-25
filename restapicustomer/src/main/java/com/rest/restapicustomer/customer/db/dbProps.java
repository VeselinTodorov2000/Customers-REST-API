package com.rest.restapicustomer.customer.db;

import com.rest.restapicustomer.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface dbProps extends JpaRepository<Customer, Long> {
}
