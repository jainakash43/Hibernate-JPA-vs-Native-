package com.hibernate.hibernatecrud;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class hibernateLoad {

	 static SessionFactory buildSessionFactory() {
		
		StandardServiceRegistry serviceRegistry=
				        new StandardServiceRegistryBuilder()
				        .configure("hibernate.cfg.xml")
				        .build();
		Metadata metadata=new MetadataSources(serviceRegistry)
				          .addAnnotatedClass(HibernateMessage.class)
				          .addAnnotatedClassName("com.hibernate.hibernatecrud.HibernateMessage")
				          .getMetadataBuilder()
				          .build();
		return metadata.getSessionFactoryBuilder().build();
		
	}
	 
	
	
}
