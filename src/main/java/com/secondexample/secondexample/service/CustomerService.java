package com.secondexample.secondexample.service;

import com.secondexample.secondexample.dto.CustomerDTO;
import com.secondexample.secondexample.dto.request.CustomerUpdateDTO;

public interface CustomerService {

    public String saveCustomer(CustomerDTO customerDTO);

    String updateCustomer(CustomerUpdateDTO customerUpdateDTO);
}
