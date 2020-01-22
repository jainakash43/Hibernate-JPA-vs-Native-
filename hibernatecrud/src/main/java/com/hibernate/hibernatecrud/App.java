package com.hibernate.hibernatecrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.cfg.Configuration;

public class App 
{
	   
	static Session sessionObj;
	
	     
    public static void main( String[] args )
    {        System.out.println( "Hello World!" );
            
        try
           {
    
            sessionObj = hibernateLoad.buildSessionFactory().openSession();
            sessionObj.beginTransaction();
            HibernateMessage message=new HibernateMessage();
            message.setText("Akash");
            sessionObj.save(message);
            sessionObj.getTransaction().commit();
           }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally {
        	if (sessionObj!=null)
        	{
        		sessionObj.close();
        	}
        }
    }
}
