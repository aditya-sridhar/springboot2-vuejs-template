package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerDetailsDAO;
import com.example.models.CustomerDetails;
import com.example.service.CustomerDetailsService;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {
	
	@Autowired
	CustomerDetailsDAO customerDetailsDao;

	@Override
	public CustomerDetails getCustomerDetails(int id) {
		return customerDetailsDao.getCustomerDetails(id);
	}

}
