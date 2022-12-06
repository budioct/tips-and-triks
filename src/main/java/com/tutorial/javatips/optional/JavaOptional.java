package com.tutorial.javatips.optional;

import java.util.Optional;

public class JavaOptional {

    public void nullCheck(Customer customer) {
        // optional
        String name = Optional.ofNullable(customer.getName())
                .orElse("");

        // manual
//        String name = customer.getName();
//        if (name == null){
//            name = "";
//        }
    }

    public void ifLogic(CustomerRepository repository) {
        // optional
        Customer customer = Optional.ofNullable(repository.findById("id"))
                .orElseGet(() -> repository.createNew());

        // manual
//        Customer customer = repository.findById("id");
//        if (customer == null){
//            customer = repository.createNew();
//        }
    }

    public void operationToNullValue(Customer customer) {
        // lambda
        String nameUpper = Optional.ofNullable(customer.getName())
                .map(value -> value.toUpperCase())
                .orElse("");
        // manual
//        String nameUpper = customer.getName();
//        if (nameUpper != null){
//            nameUpper = nameUpper.toUpperCase();
//        } else {
//            nameUpper = "";
//        }
    }

    public void nestedIdChecking(Customer customer) {
        // optional
        String country = Optional.ofNullable(customer.getAddress())
                .map(address -> address.getCountry())
                .orElse("Indonesia");

        // manual
//        String country = "Indonesia";
//        if (customer.getAddress() != null) {
//            if (customer.getAddress().getCountry() != null) {
//                country = customer.getAddress().getCountry();
//            }
//        }
    }

    public void checkAndThrowException(Customer customer) {
        // optional
        String name = Optional.ofNullable(customer.getName())
                .orElseThrow(() -> new IllegalArgumentException("Name is null"));

        //manual
//        String name = customer.getName();
//        if (name == null){
//            throw new IllegalArgumentException("Name is null");
//        }
    }

    public void ifCheckDoSomething(Customer customer) {
        // optional
        Optional.ofNullable(customer.getAddress())
                .map(address -> address.getCountry())
                .ifPresent(country -> System.out.println(country));

        //manual
//        if (customer.getAddress() != null){
//            if (customer.getAddress().getCountry() != null){
//                System.out.println(customer.getAddress().getCountry());
//            }
//        }
    }

    public void nestedObject(Customer customer) {
        // optional
        Long cashBalance = Optional.ofNullable(customer.getWallet())
                .map(wallet -> wallet.getBalance())// map() transform
                .map(balance -> balance.getCashBalance())
                .orElse(0L);

        //manual
//        Long cashBalance = 0L;
//        if (customer.getWallet() != null){
//            if (customer.getWallet().getBalance() != null){
//                cashBalance = customer.getWallet().getBalance().getCashBalance();
//            }
//        }
    }

    public void ifFilter(Customer customer) {
        // optional
        Long bonus = Optional.ofNullable(customer)
                .filter(value -> CustomerType.PREMIUM.equals(value.getType()))
                .map(value -> value.getWallet())
                .map(wallet -> wallet.getBalance())
                .map(balance -> balance.getCashBalance())
                .map(cashBalance -> cashBalance * 10 / 100) // bonus 10%
                .orElse(0L);

        //manual
//        Long bonus = 0L;
//        if (CustomerType.PREMIUM.equals(customer.getType())){
//            if (customer.getWallet() != null){
//                if (customer.getWallet().getBalance() != null){
//                    bonus = customer.getWallet().getBalance().getCashBalance() * 10 / 100;
//                }
//            }
//        }
    }


}
