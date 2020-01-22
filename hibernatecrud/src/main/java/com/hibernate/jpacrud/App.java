package com.hibernate.jpacrud;

import javax.persistence.EntityManager;

public class App {

	public static void main(String[] args) {
		
         EntityManager em=jpaLoad.createEntityManager();
         em.getTransaction().begin();
         JPAMessage message=new JPAMessage();
         message.setText("Jpa");
         em.persist(message);
         em.getTransaction().commit();
         
	}

}
