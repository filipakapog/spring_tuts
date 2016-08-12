package com.pluralsight.service.impl;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.service.CustomerService;

import java.util.List;

/**
 * Created by fghimpeteanu on 8/12/2016.
 */
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
