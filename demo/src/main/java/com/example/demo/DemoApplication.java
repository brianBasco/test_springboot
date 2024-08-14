package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.api.model.Employee;
import com.example.demo.repositories.EmployeeRepository;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Bean
	public CommandLineRunner start() {
		return (args) -> {

			Employee e1 = new Employee("Seb");
			Employee e2 = new Employee("Marion");

			employeeRepository.save(e1);
			employeeRepository.save(new Employee("JEan"));

		};
	}

}
