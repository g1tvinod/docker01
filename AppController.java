package com.example.springjpa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpa.dao.CustomerRepository;
import com.example.springjpa.entity.Customer;

@RestController
@RequestMapping("/api")
public class AppController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@PostMapping("/save")
	public ResponseEntity<Object> save(@RequestBody Customer customer) {
		customerRepository.save(customer);
		return new ResponseEntity<Object>(customer, HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public List<Customer> list() {
		return customerRepository.findAll();
	}

}
