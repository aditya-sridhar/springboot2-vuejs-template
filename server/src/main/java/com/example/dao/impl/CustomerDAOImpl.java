package com.example.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.dao.CustomerDAO;
import com.example.models.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	List<Customer> customerList;

	// Creating the DATASET since this code does not hit a DB. 
	// customerList acts as a DB to Store the customer list data
	// In a real application all these data will come from a Database
	public CustomerDAOImpl() {
		customerList = new ArrayList<>();
		Customer customer1 = new Customer(1, "John Smith", "jsm@test.com", "1356842612");
		Customer customer2 = new Customer(2, "ABCD", "abcd@test.com", "37843784634");
		Customer customer3 = new Customer(3, "Tyrion", "tyr@test.com", "6786877898");
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);

	}

	@Override
	public List<Customer> getCustomerList() {
		return customerList;
	}

}
