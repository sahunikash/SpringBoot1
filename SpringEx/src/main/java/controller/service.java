package controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.Repository.CustomerRepository;
import com.dto.UserEntity;

public class service implements CommandLineRunner  


{

	@Autowired
	DataSource datasource;
	
	@Autowired
	CustomerRepository customerrepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		
		System.out.println("DataSource" + datasource );
		
		System.out.println("find by firstname");
		for(UserEntity userentity : customerrepository.findByfirstName("nikash"));
		

		System.out.println("find by lastname");
		for(UserEntity userentity : customerrepository.findByfirstName("sahu"));
		
		

		System.out.println("find by address");
		for(UserEntity userentity : customerrepository.findByAddress("Bangalore"));
		

		System.out.println("find by jobtittle");
		for(UserEntity userentity : customerrepository.findByjobTittle("SDE"));
		

		System.out.println("find by company");
		for(UserEntity userentity : customerrepository.findBycompany("WellsFargo"));
		
		
		
	}

}
