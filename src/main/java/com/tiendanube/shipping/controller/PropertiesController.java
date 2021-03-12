package com.tiendanube.shipping.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiendanube.shipping.model.CarrierProperties;

@RestController
@RequestMapping(path = "/properties")
public class PropertiesController {
	
	@GetMapping
	public ResponseEntity<CarrierProperties> get() {
		return ResponseEntity.ok(new CarrierProperties());
	}

}
