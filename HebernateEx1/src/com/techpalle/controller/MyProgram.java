package com.techpalle.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techpalle.model.Actor;

public class MyProgram 
{
	public static void main(String[]args)
	{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		
		Actor a1=new Actor(1,"Vishnuvardhan","Kotigobba");
		Actor a2=new Actor(2,"Sudeep","Kotigobba2");
		
		s.save(a1);
		s.save(a2);
		
		t.commit();
		
		s.close();
		
		sf.close();
	}
}
