package com.wdr.springmvc.daoImpl;

import com.wdr.springmvc.dao.CustomerDao;
import com.wdr.springmvc.models.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {

        //get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        //create query
        Query<Customer> query = currentSession.createQuery("FROM Customer ORDER BY firstName",Customer.class);

        //execute query and get results
        List<Customer> customers = query.getResultList();

        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {

        Session currentSession = sessionFactory.getCurrentSession();

        currentSession.save(customer);

    }

    @Override
    public Customer getCustomerById(int id) {
        Session currentSession = sessionFactory.getCurrentSession();

        return currentSession.get(Customer.class, id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        Session currentSession = sessionFactory.getCurrentSession();

        Customer customer = currentSession.get(Customer.class,id);

        currentSession.delete(customer);
    }
}
