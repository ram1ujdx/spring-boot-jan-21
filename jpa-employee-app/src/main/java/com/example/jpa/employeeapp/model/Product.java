package com.example.jpa.employeeapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {

	@Id
	private int productId;
	private float price;
	private String productName;
	@ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
	private List<Seller> sellers=new ArrayList<Seller>();
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, float price, String productName) {
		super();
		this.productId = productId;
		this.price = price;
		this.productName = productName;
		this.sellers = sellers;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public List<Seller> getSellers() {
		return sellers;
	}
	public void setSellers(List<Seller> sellers) {
		this.sellers = sellers;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", price=" + price + ", productName=" + productName + ", sellers="
				+ sellers + "]";
	}
	
	
	
	
	
	
	
}
