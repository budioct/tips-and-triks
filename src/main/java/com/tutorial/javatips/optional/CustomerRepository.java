package com.tutorial.javatips.optional;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository{

    Customer findById(String id);

    Customer createNew();

}
