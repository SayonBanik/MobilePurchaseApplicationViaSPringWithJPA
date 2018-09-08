package com.cg.mpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobiles_157998")
public class Mobile
{

	@Id
	@Column(name="MOB_ID")
	private Integer mobId;
	
	@Column(name="MOB_NAME")
	private String mobName;
	
	@Column(name="MOB_PRICE")
	private Integer price;
	
	@Column(name="MOB_QUANTITY")
	private Integer quantity;

	public Mobile() 
	{
	
	}

	public Integer getMobId() {
		return mobId;
	}

	public void setMobId(Integer mobId) {
		this.mobId = mobId;
	}

	public String getMobName() {
		return mobName;
	}

	public void setMobName(String mobName) {
		this.mobName = mobName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	
}
