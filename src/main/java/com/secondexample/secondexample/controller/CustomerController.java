package com.secondexample.secondexample.controller;

import com.secondexample.secondexample.dto.CustomerDTO;
import com.secondexample.secondexample.dto.request.CustomerUpdateDTO;
import com.secondexample.secondexample.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) {

        customerService.saveCustomer(customerDTO);

        return "Saved";
    }

    @PutMapping("/update")
    private String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO) {

        String message = customerService.updateCustomer(customerUpdateDTO);
        return message;


    }


}
