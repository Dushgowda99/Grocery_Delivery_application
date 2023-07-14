package com.edubridge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="Item")
public class Item {
	@Id
	@SequenceGenerator(name="seq_item",sequenceName="ItemSequence",initialValue=1000,allocationSize=100)
	@GeneratedValue(generator="seq_item")
	private int item_id;
	@Column(name="item_name" )
	@NotEmpty
	@Size(min=3, message="Item Name should contain min 3 char")
	private String itemName;
	@Column(name="item_quantity")
	private int item_quantity;
	@Column(name="item_cost")
	private double item_cost;
		
	public Item() {

	}	
	
		

	public Item(String itemName,int item_quantity, double item_cost) {
	super();
	this.itemName = itemName;
	this.item_quantity = item_quantity;
	this.item_cost = item_cost;
}

	public int getItem_id() {
		return item_id;
	}


	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItem_quantity() {
		return item_quantity;
	}
	public void setItem_quantity(int item_quantity) {
		this.item_quantity = item_quantity;
	}
	public double getItem_cost() {
		return item_cost;
	}
	public void setItem_cost(double item_cost) {
		this.item_cost = item_cost;
	}
	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", itemName=" + itemName + ", item_quantity=" + item_quantity
				+ ", item_cost=" + item_cost + "]";
	}
	
	

}
