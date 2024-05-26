package com.cypsolabs.Springboot1.serviceImpl;

import com.cypsolabs.Springboot1.dto.CustomerDTO;
import com.cypsolabs.Springboot1.entity.Customer;
import com.cypsolabs.Springboot1.repository.CustomerRepo;
import com.cypsolabs.Springboot1.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;
    @Override
    public void save(CustomerDTO customerDTO) {

        try {
            Customer customer = new Customer(
                    customerDTO.getId(),
                    customerDTO.getName(),
                    customerDTO.getNic(),
                    customerDTO.getCity(),
                    customerDTO.getContact()
            );
            customerRepo.save(customer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
