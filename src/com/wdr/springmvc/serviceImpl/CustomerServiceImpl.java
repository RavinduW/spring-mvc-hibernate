package com.wdr.springmvc.serviceImpl;

import com.wdr.springmvc.dao.CustomerDao;
import com.wdr.springmvc.models.Customer;
import com.wdr.springmvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDao.getCustomers();
    }
}
