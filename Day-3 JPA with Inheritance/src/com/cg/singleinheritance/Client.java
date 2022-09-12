package com.cg.singleinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(null);
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		// create an Employee1
		Employee e1 = new Employee();
		e1.setName("Monika");
		e1.setSalary(35000);
		em.persist(e1);

		// create an Employee2
		Employee e2 = new Employee();
		e2.setName("Priyanka");
		e2.setSalary(25000);
		em.persist(e2);

		// create an Manager
		Manager m=new Manager();
		m.setName("Sumit");
		m.setSalary(55000);
		m.setDeptname("Information Technology");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("Data in Inserted");
		em.close();
		factory.close();
	}

}
