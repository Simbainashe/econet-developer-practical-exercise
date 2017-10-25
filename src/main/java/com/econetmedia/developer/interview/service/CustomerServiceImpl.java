/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetmedia.developer.interview.service;

import com.econetmedia.developer.interview.exception.ValidationException;
import com.econetmedia.developer.interview.model.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author FSM
 */
public class CustomerServiceImpl implements CustomerService{
    

    @Override
    public boolean registerCustomer(Customer customer) {
        Optional<Customer> optional = Optional.ofNullable(customer); 
        if(customer.getFirstName().isEmpty()){
            throw new ValidationException("First name is null");
        }
        
        if(customer.getNationalId().length()<5){
            throw new ValidationException("National ID is very short");
        }
        return optional.isPresent();
    }

    @Override
    public Optional<Customer> findCustomer(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Customer> filterByGradeOrSalary(String grade, Number salary, List<Customer> customerInputList) {
    
        List<Customer> result = customerInputList.stream()
                .filter(customer -> customer.getGrade().equals(grade))
                .filter(customer -> customer.getSalary()==salary)
                .collect(Collectors.toList());
        return  result;
    
}
}