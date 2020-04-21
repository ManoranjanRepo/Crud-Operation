package com.vk.customer.dal.repositor;

import org.springframework.data.repository.CrudRepository;

import com.vk.customer.dal.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
