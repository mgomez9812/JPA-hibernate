package com.mario.hibernate.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.mario.hibernate.modelo.*;
public class TestEmpleados {
	private static EntityManager manager; 
	private static EntityManagerFactory emf;
	
	@SuppressWarnings("unchecked")	
	public static void main(String[] args) {		
		emf = Persistence.createEntityManagerFactory("AplicacionEjemplo");
		manager = emf.createEntityManager();

		List<Empleado> empleados = (List<Empleado>) manager.createQuery("FROM EMPLEADO").getResultList();
		System.out.println(empleados);
		
	}

}
