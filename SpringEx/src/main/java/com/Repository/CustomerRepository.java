package com.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.dto.UserEntity;

import java.util.List;

public interface CustomerRepository extends BaseRepository<UserEntity, String> {

	List<UserEntity> findByfirstName(String firstName);

	List<UserEntity> findBylastName(String lastName);

	List<UserEntity> findByAddress(String address);

	List<UserEntity> findByjobTittle(String jobtittle);

	List<UserEntity> findBycompany(String company);
	
	List<UserEntity> findAll();

}