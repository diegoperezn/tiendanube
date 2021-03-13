package com.tiendanube.shipping.model;

public class Rate {

//    {
//        "name": ,
//        "code": "standard",
//        "price": 0.00,
//        "price_merchant": 14.15,
//        "currency": "ARS",
//        "type": "ship",
//        "min_delivery_date": "2016-07-14T14:48:45-0300",
//        "max_delivery_date": "2016-07-17T14:48:45-0300",
//        "phone_required": true,
//        "reference": "ref123"
//    }

	private String name = "Standard Shipping";
	private String code = "standard";
	private double price = 12.0;
	private Double price_merchant;
	private String currency = "ARS";
	private String type = "ship";
	private String min_delivery_date = "2016-07-14T14:48:45-0300";
	private String max_delivery_date = "2016-07-17T14:48:45-0300";
	private boolean phone_require = true;
	private String reference = "ref123";

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public double getPrice() {
		return price;
	}

	public String getCurrency() {
		return currency;
	}

	public String getType() {
		return type;
	}

	public String getMin_delivery_date() {
		return min_delivery_date;
	}

	public String getMax_delivery_date() {
		return max_delivery_date;
	}

	public boolean isPhone_require() {
		return phone_require;
	}

	public String getReference() {
		return reference;
	}

}
