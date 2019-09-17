package com.anuj;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SearcDetails {

	public static void main(String[] args) {
		SessionFactory sf = Utility.getSF();
		Session session = sf.openSession();
		Transaction t=session.beginTransaction();
		
		Criteria cr=session.createCriteria(Employee.class);
		List<Employee> list=cr.list();
		for(Employee e:list)
		{
			System.out.println(e.getEid()+", "+e.getEname()+", "+e.getLap().getLapid()+", "+e.getVehicle().getBrand());
			
		}
		
		Criteria cr1=session.createCriteria(Laptop.class);
		List<Laptop> list1=cr1.list();
		for(Laptop e:list1)
		{
			System.out.println(e.getLapid()+", "+e.getCompany()+", "+e.getEmp().getEname()+", "+e.getEmp().getVehicle().getBrand());
			
		}
		
		t.commit();
		
		
	}

}
