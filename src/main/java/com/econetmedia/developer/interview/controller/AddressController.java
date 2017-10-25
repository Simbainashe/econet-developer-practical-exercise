/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetmedia.developer.interview.controller;

import com.econetmedia.developer.interview.model.Address;
import com.econetmedia.developer.interview.rest.RestConsumerImpl;
import com.econetmedia.developer.interview.rest.SampleRestObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author FSM
 */
@RestController
public class AddressController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private RestConsumerImpl consumerImpl;
    
    @RequestMapping(value = "/addAddress/", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<Void> addAddress(@RequestBody Address address) {

        log.info(address.toString());

        SampleRestObject sampleRestObject= consumerImpl.makeRestCall(1);
        log.info(sampleRestObject.toString());
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
    
}
