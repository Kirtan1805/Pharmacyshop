package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Userentity {
	@Id
	private int id;
	private String productname;
	private int price;
	private int quantity;
	public Userentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userentity(int id, String productname, int price, int quantity) {
		super();
		this.id = id;
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}	
	