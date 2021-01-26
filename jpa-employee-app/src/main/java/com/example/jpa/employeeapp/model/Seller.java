package com.example.jpa.employeeapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Seller {

	@Id
	private int sellerId;
	private String email;
	private String sellerName;
	@ManyToMany
	private List<Product> products=new ArrayList<Product>();
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Seller(int sellerId, String email, String sellerName) {
		super();
		this.sellerId = sellerId;
		this.email = email;
		this.sellerName = sellerName;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", email=" + email + ", sellerName=" + sellerName + "]";
	}
	
	
}
