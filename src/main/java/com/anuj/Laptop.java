package com.anuj;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private int lapid;
	private String company;
	private int price;
	
	@OneToOne(mappedBy="lap")
	private Employee emp;
	
	public Laptop() {
		super();
	}

	public Laptop(int lapid) {
		super();
		this.lapid = lapid;
		
	}

	
	public Laptop(int lapid, String company, int price,Employee emp) {
		super();
		this.lapid = lapid;
		this.company = company;
		this.price = price;
		this.emp=emp;
	}


	public int getLapid() {
		return lapid;
	}


	public void setLapid(int lapid) {
		this.lapid = lapid;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	
	

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Laptop [lapid=" + lapid + ", company=" + company + ", price=" + price + ", emp=" + emp + "]";
	}

	
	
	
	
	
	
}
