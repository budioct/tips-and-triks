package com.tutorial.javatips.optional;

import lombok.Data;

@Data
public class Customer {

    private Long id;

    private String name;

    private Address address;

    private Wallet wallet;

    private CustomerType type;

}
