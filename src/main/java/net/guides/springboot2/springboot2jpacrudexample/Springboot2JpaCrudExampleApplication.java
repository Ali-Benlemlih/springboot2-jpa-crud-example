package net.guides.springboot2.springboot2jpacrudexample;

import net.guides.springboot2.springboot2jpacrudexample.controller.EmployeeController;
import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot2JpaCrudExampleApplication {
	

	public static void main(String[] args) {
		Employee employee = new Employee("a","a","a");
		employee.toString();
		SpringApplication.run(Springboot2JpaCrudExampleApplication.class, args);
	}
}
