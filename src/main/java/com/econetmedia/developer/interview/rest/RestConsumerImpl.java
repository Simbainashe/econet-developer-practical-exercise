/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetmedia.developer.interview.rest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

/**
 *
 * @author FSM
 */
public class RestConsumerImpl implements RestConsumer {

    @Autowired
    RestTemplateFactory restTemplateFactory;

    @Override
    public SampleRestObject makeRestCall(int postId) {

        SampleRestObject sampleRestObject = new SampleRestObject();
        Map<String, String> params = new HashMap<>();
        params.put("id", postId + "");

        HttpEntity<?> requestEntity = new HttpEntity(getRestServiceHeaders());

        HttpEntity<SampleRestObject> responseEntity = restTemplateFactory.getObject().exchange("https://jsonplaceholder.typicode.com/posts/{postId}",
                HttpMethod.GET, requestEntity, SampleRestObject.class, params);

        return responseEntity.getBody();

    }

    private HttpHeaders getRestServiceHeaders() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        requestHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        return requestHeaders;
    }

}
