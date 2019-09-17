package com.anuj;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class QBCDemo {

	public static void main(String[] args) {
		
		
		SessionFactory sf = Utility.getSF();
		Session session = sf.openSession();
		Transaction t=session.beginTransaction();
		
		Criteria cr=session.createCriteria(Emp.class);
		Criterion crt=Restrictions.gt("salary", 22000);
		cr.add(crt);
		List<Emp> list=(List<Emp>)cr.list();
		System.out.println("Retrieval using QBC ");
		for(Emp e:list)
			System.out.println(e);
		
		Criteria cr2=session.createCriteria(Emp.class);
		cr2.addOrder(Order.desc("salary"));
		cr2.addOrder(Order.asc("ename"));
		List<Emp> list2=(List<Emp>)cr2.list();
		System.out.println("\nRetrieval using QBC and ordering");
		for(Emp e:list2)
			System.out.println(e);
		
		
		Criteria cr1=session.createCriteria(Emp.class);
		ProjectionList plist=Projections.projectionList();
		Projection p1=Projections.property("ename");
		plist.add(p1);
		cr1.setProjection(plist);
		List<Object> list1=cr1.list();
		System.out.println("\nRetrieval using QBC and projection");
		for(Object o:list1)
			System.out.println(o);
		
		
		System.out.println("Retrieval using HQL");
		String hql="from Emp where salary>22000 and ename not in ('Rupal')";
		Query query=session.createQuery(hql);
		List<Emp> list3=query.getResultList();
		for(Emp emp:list3)
			System.out.println(emp);
		
		/*
		System.out.println("DML using HQL");
		String hql1="update EMP set ename=:name where eno=:code";
		Query query1=session.createQuery(hql1);
		query1.setParameter("name", "Shubham");
		query1.setParameter("code", 104);
		
		
		int r=query1.executeUpdate();
		System.out.println("updation done");
		*/
		
		System.out.println("Retrieval using sQL");
		String sql="select * from Emp";
		SQLQuery query2=session.createNativeQuery(sql);
		query2.addEntity(Emp.class);
		List<Emp> list4=query2.list();
		for(Emp emp:list4)
			System.out.println(emp);
		
		t.commit();
		session.close();
	}
}
