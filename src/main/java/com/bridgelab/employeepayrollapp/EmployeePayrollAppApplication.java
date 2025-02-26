package com.bridgelab.employeepayrollapp;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppApplication {

	public static void main(String[] args) {

		log.info("*********Starting Employee Payroll Application***********");
		SpringApplication.run(EmployeePayrollAppApplication.class, args);
	}

}