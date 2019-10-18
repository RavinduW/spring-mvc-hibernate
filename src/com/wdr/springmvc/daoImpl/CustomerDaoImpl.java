package com.wdr.springmvc.daoImpl;

import com.wdr.springmvc.dao.CustomerDao;
import com.wdr.springmvc.models.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Customer> getCustomers() {

        //get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        //create query
        Query<Customer> query = currentSession.createQuery("FROM Customer",Customer.class);

        //execute query and get results
        List<Customer> customers = query.getResultList();

        return null;
    }
}
