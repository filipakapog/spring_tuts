package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by fghimpeteanu on 8/12/2016.
 */
public interface CustomerService {
    List<Customer> findAll();
}
