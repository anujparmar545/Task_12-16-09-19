package com.anuj;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {

	
	public static SessionFactory getSF()
	{
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		
		return sf;
	}
}
