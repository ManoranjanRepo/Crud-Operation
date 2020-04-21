package com.vk.customer.dal;

import java.util.Optional;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vk.customer.dal.entity.Customer;
import com.vk.customer.dal.repositor.CustomerRepo;


@SpringBootTest
class CustomerDataApplicationTests {
	@Autowired
	private CustomerRepo repos;

	@Test
	public void testCreateCustomer() {
		  Customer customer = new Customer();
		  customer.setName("manoranjan");
		  customer.setEmail("manu@gmail.com");
		  repos.save(customer);
		  
	}
	@Test
	public void testReadCustomerById() {
		Optional<Customer> customerOptional=repos.findById(1);
		if (customerOptional.isPresent()) {
		Customer  customer=customerOptional.get();
			System.out.println(customer);
		}else {
			System.out.println("customer id is not matching with data base table..");
		}
	}
	@Test
	public void testUpdateCustomer() {
		Optional<Customer> customerOptional=repos.findById(1);
		if (customerOptional.isPresent()) {
		Customer customer=customerOptional.get();
			customer.setEmail("m@gmail.com");
			repos.save(customer);
		}else {
			System.out.println("customer id is not matching with data base table..");
		}
	}
	@Test
	public void testDeleteCustomerById() {
		repos.deleteById(2);
		System.out.println("customer 1 succesfullt deleted");
	}

}
