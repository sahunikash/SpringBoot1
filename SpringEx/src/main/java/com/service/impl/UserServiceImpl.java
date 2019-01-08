package com.service.impl;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Repository.CustomerRepository;
import com.dto.UserEntity;
import com.services.UserServices;

@Component
@Service
public class UserServiceImpl implements UserServices{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<UserEntity> findUserEntity(String name) {
		return customerRepository.findByfirstName(name);
	}

	@Override
	public void save(UserEntity entity) {
		customerRepository.save(entity);
	}

	@Override
	public List<UserEntity> findAll() {
		return (List<UserEntity>) customerRepository.findAll();
	}
}
