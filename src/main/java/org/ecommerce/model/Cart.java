package org.ecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

public class Cart {

	@Id
	@GeneratedValue
	private int cartId;
	private int productId;
	private double price;
	private double quantity;
	private String email;
	//private int productName;
	//@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
		//private List<Order> orders;
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int i) {
		this.productId = i;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double d) {
		this.quantity = d;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
