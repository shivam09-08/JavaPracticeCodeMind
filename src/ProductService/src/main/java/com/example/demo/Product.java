package com.example.demo;

public class Product {
	
	private int id;
	private String name;
	private String qunt;
	private String price;
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getQunt() {
		return qunt;
	}
	public String getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setQunt(String qunt) {
		this.qunt = qunt;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qunt=" + qunt + ", price=" + price + "]";
	}
	
	

}
