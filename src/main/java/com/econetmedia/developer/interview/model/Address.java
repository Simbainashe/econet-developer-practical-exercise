/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetmedia.developer.interview.model;

/**
 *
 * @author FSM
 */
public class Address {
    
    private String addressLine1;
    private String addressLine2;
    private String district;
    private Number province;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Number getProvince() {
        return province;
    }

    public void setProvince(Number province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" + "addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", district=" + district + ", province=" + province + '}';
    }
    
    
    
    
}
