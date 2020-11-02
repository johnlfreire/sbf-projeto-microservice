package com.br.sfb.AccountManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountManagementApplication.class, args);
	}

}
