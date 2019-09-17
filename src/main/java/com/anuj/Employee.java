package com.anuj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="xx")
public class Employee {

	@Id
	@Column(name="eno")
	private int eid;
	private String ename;
	private int salary;
	
	@OneToOne
	private Vehicle vehicle;
	
	@OneToOne
	private Laptop lap;
	
	public Employee() {
		super();
	}

	public Employee(int eid) {
		super();
		this.eid = eid;
	}

	public Employee(int eid, String ename, int salary, Vehicle vehicle,Laptop lap) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.vehicle = vehicle;
		this.lap=lap;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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

	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", vehicle=" + vehicle + ", lap="
				+ lap + "]";
	}

	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	
	
	
}
