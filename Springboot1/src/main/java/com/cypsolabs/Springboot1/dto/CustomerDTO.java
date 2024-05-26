package com.cypsolabs.Springboot1.dto;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    private int Id;
    private String name;
    private int nic;
    private String city;
    private List<Integer> contact;

}
