/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetmedia.developer.interview.service;

import com.econetmedia.developer.interview.model.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author FSM
 */
public class CustomerServiceImpl implements CustomerService{
    

    @Override
    public boolean registerCustomer(Customer customer) {
        Optional<Customer> optional = Optional.ofNullable(customer); 
        return optional.isPresent();
    }

    @Override
    public Optional<Customer> findCustomer(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Customer> filterByGradeOrSalary(String grade, Number salary, List<Customer> customerInputList) {
        return  customerInputList;
    
}
}