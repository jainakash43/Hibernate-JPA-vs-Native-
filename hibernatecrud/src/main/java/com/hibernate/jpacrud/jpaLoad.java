package com.hibernate.jpacrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpaLoad {

	static EntityManager createEntityManager() {
		EntityManagerFactory entitymanagerfactory= 
				Persistence.createEntityManagerFactory("persistence");
		EntityManager entitymanager=entitymanagerfactory.createEntityManager();
		return entitymanager;
	}
	
}
