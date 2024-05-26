package com.cypsolabs.Springboot1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id", length = 20)
    private int Id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "nic", length = 30)
    private int nic;

    @Column(name = "city", length = 50)
    private String city;

    @ElementCollection
    private List<Integer> contact;

}
