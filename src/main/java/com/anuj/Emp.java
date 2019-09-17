package com.anuj;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {

	@Id
	private int eno;
	private String ename;
	private int salary;
	
	public Emp() {}
		
	public Emp(int eno, String ename, int salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
	
}
