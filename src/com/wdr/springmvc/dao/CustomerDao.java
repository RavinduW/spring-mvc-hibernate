package com.wdr.springmvc.dao;

import com.wdr.springmvc.models.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> getCustomers();
}
