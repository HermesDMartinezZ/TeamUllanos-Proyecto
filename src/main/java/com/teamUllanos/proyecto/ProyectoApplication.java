package com.teamUllanos.proyecto;

import com.teamUllanos.proyecto.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ProyectoApplication.class, args);


		System.out.println("#### MINI APLICACION DE FUNCIONAMIENTO");
		System.out.println("Realizar test!!!");

		//Creando empresas
		Enterprise e1 = new Enterprise("Agrosavia", "Villavicencio", "0180005851",54183);
		Enterprise e2 = new Enterprise("Terpel", "Guamal", "516809", 51508060);
		Enterprise e3 = new Enterprise("Omnipro", "Panama", "541823697", 12365479);

		//Creando lista de empresas
		ListEnterprise list = new ListEnterprise();

		//Agregando empresas a una lista
		list.addEnterprise(e1);
		list.addEnterprise(e2);
		list.addEnterprise(e3);

		//Mostrar empresas
		System.out.println("Mostrar empresas: \n");
		List<Enterprise> empresas = list.getEnterprises();
		for (int i = 0; i < empresas.size(); i++){
			System.out.println("Nombre -> " + empresas.get(i).getName());
		}

		//Creando trabajadores para empresa 1
		Employee t1 = new Employee(123456, "Juan", "juan@gmail.com", e1, RoleName.OPERATIVO);
		Employee t2 = new Employee(789456, "Matias", "matias@gmail.com", e1, RoleName.ADMINISTRADOR);
		e1.addEmpleado(t1);
		e1.addEmpleado(t2);

		System.out.println("\nMostrar empleados empresa 1: \n");
		List<Employee> empleados_e1 = e1.getEmpleados();
		for (int i = 0; i < empleados_e1.size(); i++){
			System.out.println("Nombre -> " + empleados_e1.get(i).getName() + " Rol: " + empleados_e1.get(i).getRoleName());
		}

		//Creando trabajadores para empresa 2
		Employee t3 = new Employee(2222222, "Pedro", "Pedro@gmail.com", e2, RoleName.OPERATIVO);
		Employee t4 = new Employee(3333333, "Daniel", "Daniel@gmail.com", e2, RoleName.ADMINISTRADOR);
		e2.addEmpleado(t3);
		e2.addEmpleado(t4);

		System.out.println("\nMostrar empleados empresa 2: \n");
		List<Employee> empleados_e2 = e2.getEmpleados();
		for (int i = 0; i < empleados_e2.size(); i++){
			System.out.println("Nombre -> " + empleados_e2.get(i).getName() + " Rol: " + empleados_e2.get(i).getRoleName());
		}

		//Agregar trabajdores a una list
		ListEmployee list2 = new ListEmployee();
		list2.addEmpleado(t1);
		list2.addEmpleado(t2);
		list2.addEmpleado(t3);
		list2.addEmpleado(t4);

		System.out.println("\nMostrar empleados existentes: \n");
		List<Employee> empleados = list2.getAll();
		for (int i = 0; i < empleados.size(); i++){
			System.out.println("Nombre -> " + empleados.get(i).getName() + " Empresa : " +empleados.get(i).getEnterprise().getName() + " Rol: " + empleados.get(i).getRoleName() );
		}

		//Crear transsacciones
		Transaccions p1 = new Transaccions(112315, (float) 5000.0,"Pago", t1);
		Transaccions p2 = new Transaccions(102315, (float) 5000.0,"Pago", t2);

		t1.addTransaccion(p1);
		t2.addTransaccion(p2);

		e1.addTransaccion(p1);
		e1.addTransaccion(p2);

		System.out.println("\n Transaccioes de la empresa 1\n");
		List<Transaccions> transaccions = e1.getTransaccions();
		for (int i = 0; i < e1.getTransaccions().size(); i++){
			System.out.println("id " + transaccions.get(i).getId() + " Operario : " + transaccions.get(i).getEmployee().getName());
		}
	}

}
