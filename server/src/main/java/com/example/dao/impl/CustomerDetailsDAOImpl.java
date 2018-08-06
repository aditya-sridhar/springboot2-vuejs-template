package com.example.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.dao.CustomerDetailsDAO;
import com.example.models.CustomerDetails;

@Repository
public class CustomerDetailsDAOImpl implements CustomerDetailsDAO {
	
	Map<Integer, CustomerDetails> customerDetailsMap;

	// customerDetailsMap Stores data on all the customer details
	// In a real application all these data will come from a Database
	public CustomerDetailsDAOImpl() {

		customerDetailsMap = new HashMap<>();
		CustomerDetails customerDetails1 = new CustomerDetails(1, "John Smith", "jsm@test.com", "1356842612",
				"Bangalore", "Karnataka", "India", "Company1", "Developer", "Very interested in the products");
		CustomerDetails customerDetails2 = new CustomerDetails(2, "ABCD", "abcd@test.com", "37843784634",
				"Mangalore", "Karnataka", "India", "Company2", "Analyst", "Very interested in the products but buys rarely");
		CustomerDetails customerDetails3 = new CustomerDetails(3, "Tyrion", "tyr@test.com", "6786877898",
				"Chennai", "Tamil Nadu", "India", "Company3", "CEO", "Has Bought Products before");
		
		customerDetailsMap.put(1, customerDetails1);
		customerDetailsMap.put(2, customerDetails2);
		customerDetailsMap.put(3, customerDetails3);

	}

	@Override
	public CustomerDetails getCustomerDetails(int id) {
		// TODO Auto-generated method stub
		return customerDetailsMap.get(id);
	}

}
