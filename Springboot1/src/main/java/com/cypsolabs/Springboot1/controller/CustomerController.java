package com.cypsolabs.Springboot1.controller;

import com.cypsolabs.Springboot1.dto.CustomerDTO;
import com.cypsolabs.Springboot1.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/save")
    public void save(@RequestBody CustomerDTO customerDTO) {
       customerService.save(customerDTO);
    }

}
