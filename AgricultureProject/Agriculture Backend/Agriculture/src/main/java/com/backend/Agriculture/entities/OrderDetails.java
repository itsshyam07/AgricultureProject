package com.backend.Agriculture.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/*@Getter
@Setter*/
/*@NoArgsConstructor
@AllArgsConstructor*/
@Entity
public class OrderDetails {

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public OrderDetails() {
		super();
	}

	public OrderDetails(Product product, int qty, Orders orders) {
		super();
		this.product = product;
		this.qty = qty;
		this.orders = orders;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;
	
	private int qty;
	
	@ManyToOne
	@JoinColumn(name="orderId")
	private Orders orders;
}

