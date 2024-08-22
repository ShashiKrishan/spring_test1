package com.secondexample.secondexample.controller;

import com.secondexample.secondexample.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {

    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) {

        return "";
    }


}
