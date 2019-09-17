package com.anuj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test1 {

	public static void main(String[] args) {
		 
		SessionFactory sf = Utility.getSF();
		Session session = sf.openSession();
		Transaction t=session.beginTransaction();
		
		Employee e1=new Employee(101, "Anuj", 24218,new Vehicle(203),new Laptop(303));
		Employee e2=new Employee(102, "Ankur", 56818,new Vehicle(201),new Laptop(302));
		Employee e3=new Employee(103, "Hero", 87456,new Vehicle(202),new Laptop(301));
		
		session.save(e1); session.save(e2); session.save(e3);
		
		/*
		 Employee e1=new Employee(101, "Anuj", 24218);
		Employee e2=new Employee(102, "Ankur", 56818);
		Employee e3=new Employee(103, "Hero", 87456);
		
		session.save(e1); session.save(e2); session.save(e3);
		
	
		Vehicle v1=new Vehicle(201, "Hero", "M01", 5000);
		Vehicle v2=new Vehicle(202, "Honda", "M02", 6253);
		Vehicle v3=new Vehicle(203, "KTM", "M03", 86542);
		
		session.save(v1); session.save(v2); session.save(v3);
		*/
		
		
		t.commit();
		
		session.close();
		sf.close();
		
	}
}
