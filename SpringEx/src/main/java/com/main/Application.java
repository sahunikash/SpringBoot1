package com.main;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableJpaRepositories("com.Repository")
@ComponentScan("com")
@SpringBootApplication(scanBasePackages = { "com" })
@EntityScan("com.dto")  
public class Application {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
