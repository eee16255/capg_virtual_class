package com.capg.demo.model;

<<<<<<< HEAD
<<<<<<< HEAD

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Product {
      @Id
	  private int productId;
	  private String productName;
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_details")
public class Product {

	  @Id
	  @Column(name="productid")
	  @GeneratedValue
	  private int productId;
	  
	  @Column(name="productname",length=15)
	  private String productName;
	  
	  @Column(name="productprice")
>>>>>>> branch 'master' of https://github.com/eee16255/capg_virtual_class.git
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_details")
public class Product {

	  @Id
	  @Column(name="productid")
	  @GeneratedValue
	  private int productId;
	  
	  @Column(name="productname",length=15)
	  private String productName;
	  
	  @Column(name="productprice")
>>>>>>> branch 'master' of https://github.com/eee16255/capg_virtual_class.git
	  private double price ;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	  
	  
}
