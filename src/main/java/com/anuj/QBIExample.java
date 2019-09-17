package com.anuj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QBIExample {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t=session.beginTransaction();
		
		Emp emp=session.get(Emp.class, 102);
		System.out.println(emp);
		t.commit();
		session.close();
	}
}
