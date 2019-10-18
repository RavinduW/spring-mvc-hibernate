package com.wdr.springmvc.service;

import com.wdr.springmvc.models.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);

    public Customer getCustomerById(int id);

    public void updateCustomer(Customer customer);
}
