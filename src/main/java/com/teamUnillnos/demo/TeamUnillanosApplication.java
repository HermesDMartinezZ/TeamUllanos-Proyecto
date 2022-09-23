package com.teamUnillnos.demo;

import com.teamUnillnos.demo.entities.Employee;
import com.teamUnillnos.demo.entities.Enterprise;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeamUnillanosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamUnillanosApplication.class, args);

		Employee employee = new Employee("Juan","juan@gmail.com", "0129984", "ADMINISTRADOR", 1236548, null);
		Enterprise enterprise = new Enterprise("Apple", "Villavicencio Meta", "301456872", 12364789, employee);


		System.out.println(enterprise.toString());

	}


}
