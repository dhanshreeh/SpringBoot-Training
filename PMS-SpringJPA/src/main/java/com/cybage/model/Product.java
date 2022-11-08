package com.cybage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
//@Getter
//@Setter
@Entity
//@ToString
@Table(name="product_info")
public class Product {
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int productId;

	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_price")
	private  int price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product(int productId, String productName, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public Product() {
		
	}
	
	
	
	
}
