package com.wdr.springmvc.dao;

import com.wdr.springmvc.models.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);

    public Customer getCustomerById(int id);

    public void updateCustomer(Customer customer);

    public void deleteCustomer(int id);
}
