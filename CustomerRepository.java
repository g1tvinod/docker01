package com.example.springjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springjpa.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
}
