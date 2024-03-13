package com.backend.Agriculture.entities;


import java.util.Date;

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

/*
@Getter
@Setter*/
/*@NoArgsConstructor
@AllArgsConstructor*/
@Entity
public class Orders {
	
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Orders() {
		super();
	}

	public Orders(Date orderDate, Customer customer, Address address, Payment payment) {
		super();
		this.orderDate = orderDate;
		this.customer = customer;
		this.address = address;
		this.payment = payment;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	private Date orderDate;
	
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="addressId")
	private Address address;
	
	@ManyToOne
	@JoinColumn(name="paymentId")
	private Payment payment;
}

