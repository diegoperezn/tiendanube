package com.tiendanube.shipping.model;

import java.util.Date;

public class CarrierProperties {

	private long id;
	private String name;
	private String callback_url;
	private String types;
	private String active;
	private Date created_at;
	private Date updated_at;

	public CarrierProperties() {
		this.id = 2810;
		this.name = "Diego Shipping";
		this.callback_url = "https://qa-tiendanube.herokuapp.com/rates";
		this.types = "ship,pickup";
		this.active = "true";
		this.created_at = new Date();
		this.updated_at = new Date();
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCallback_url() {
		return callback_url;
	}

	public String getTypes() {
		return types;
	}

	public String getActive() {
		return active;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

}
