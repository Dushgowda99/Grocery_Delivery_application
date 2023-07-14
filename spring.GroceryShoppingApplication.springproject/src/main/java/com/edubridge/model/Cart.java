package com.edubridge.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {
	@Id
	@SequenceGenerator(name="seq_cart",sequenceName="CartSequence",initialValue=10000,allocationSize=10)
    @GeneratedValue(generator="seq_cart")
	@Column(name="cart_id")
	private int cart_id;
	@Column(name="cartItemName")
	private String cartItemName;
	@Column(name="quantity")
	private int quantity;
	@Column(name="total_cost")
	private double total_cost;
	
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public User getUser() {
		return user;
	}
    public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name="item_id")
    private Item item;
    
	
   public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

public Cart() {
	
}

public Cart(int cart_id, String cartItemName, int quantity, double total_cost, User user, Item item) {
	super();
	this.cart_id = cart_id;
	this.cartItemName = cartItemName;
	this.quantity = quantity;
	this.total_cost = total_cost;
	this.user = user;
	this.item = item;
}
public int getCart_id() {
	return cart_id;
}

public void setCart_id(int cart_id) {
	this.cart_id = cart_id;
}

public String getCartItemName() {
	return cartItemName;
}

public void setCartItemName(String cartItemName) {
	this.cartItemName = cartItemName;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getTotal_cost() {
	return total_cost;
}

public void setTotal_cost(double total_cost) {
	this.total_cost = total_cost;
}
@Override
public String toString() {
	return "Cart [cart_id=" + cart_id + ", cartItemName=" + cartItemName + ", quantity=" + quantity + ", total_cost="
			+ total_cost + ", user=" + user + ", item=" + item + "]";
}

}
	
	
	

