package com.anuj;


import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Emp e1=new Emp(101, "Anuj", 25000);
		Emp e2=new Emp(102, "Rupal", 24000);
		Emp e3=new Emp(103, "Aman", 23000);
		Emp e4=new Emp(104, "Mansi", 22000);
		Emp e5=new Emp(105, "Faiz", 21546);
		Transaction t=s.beginTransaction();
		System.out.println("done");
		s.save(e1); s.save(e2); s.save(e3); s.save(e4); s.save(e5);
		e1.setEname("Anuj Parmar");
		s.update(e1);
		
		
		t.commit();
		s.close();
	}

}
