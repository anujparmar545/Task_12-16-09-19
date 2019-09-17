package com.anuj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {

	@Id
	private int regno;
	private String brand;
	private String model;
	private int price;
	
	@OneToOne(mappedBy="vehicle")
	private Employee emp;
	
	
	
	public Vehicle() {
		super();
	}



	public Vehicle(int regno) {
		super();
		this.regno = regno;
	}



	public Vehicle(int regno, String brand, String model, int price, Employee emp) {
		super();
		this.regno = regno;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.emp = emp;
	}



	public int getRegno() {
		return regno;
	}



	public void setRegno(int regno) {
		this.regno = regno;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
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
		return "Vehicle [regno=" + regno + ", brand=" + brand + ", model=" + model + ", price=" + price + ", emp=" + emp
				+ "]";
	}



	public Vehicle(int regno, String brand, String model, int price) {
		super();
		this.regno = regno;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	
	
}
