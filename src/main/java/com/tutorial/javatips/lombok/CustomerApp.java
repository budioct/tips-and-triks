package com.tutorial.javatips.lombok;

public class CustomerApp {

    public static void main(String[] args){

        // class entity/bean/domain
//        Customer customer = new Customer();
//        customer.setId("1");
//        customer.setName("oct");
//        customer.setEmail("oct@test.com");

        // class builder
        Customer customer = Customer
                .builder()
                .id("1")
                .name("oct")
                .email("oct@test.com")
                .build();

        System.out.println(customer);

    }

}
