package com.cg.uni.onetoone;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//program on OneToOne Unidirectional
public class OneToOneUniDirectional {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s=new Student();
		s.setRollno(101);
		s.setName("Monika");
		s.setPercentage(85.30f);
		
		Address a=new Address();
		a.setStreetno(12);
		a.setArea("Airoli");
		a.setCity("Navi Mumbai");
		a.setState("Maharashtra");
		
		s.setAddress(a);
		
		em.persist(s);
		
		System.out.println("Rows is inserted");
		
		em.getTransaction().commit();
		em.close();
		factory.close();

		
		

	}

}


