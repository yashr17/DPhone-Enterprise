package com.dphone.buyingdetails.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "buyingdetails")

public class BuyingDetailsEntity {
	
	@Id
	@Column(name = "customer_id")
	private long customer_id;
	private String product_name;
	private String purchase_date;
	
	public BuyingDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}

	public BuyingDetailsEntity(long customer_id, String product_name, String purchase_date) {
		this.customer_id = customer_id;
		this.product_name = product_name;
		this.purchase_date = purchase_date;
	}

	@Override
	public String toString() {
		return "BuyingDetailsEntity{" +
				"customer_id=" + customer_id +
				", product_name='" + product_name + '\'' +
				", purchase_date='" + purchase_date + '\'' +
				'}';
	}
}
