package com.pluralsight.repository.impl;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fghimpeteanu on 8/12/2016.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Filip");
        customer.setLastName("Ghimpeteanu");

        customers.add(customer);

        return customers;
    }
}
