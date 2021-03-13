package com.tiendanube.shipping.model;

import java.util.ArrayList;
import java.util.List;


public class Rates {
	
	List<Rate> rates = new ArrayList<>();
	
	public Rates() {
		this.rates.add(new Rate());
	}
	
	public List<Rate> getRates() {
		return rates;
	}

}
