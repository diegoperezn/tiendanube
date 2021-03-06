package com.tiendanube.shipping.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiendanube.shipping.model.Rates;

@RestController
@RequestMapping(path = "/rates")
public class RateController {

	Logger logger = LoggerFactory.getLogger(RateController.class);
	
	@PostMapping()
	public ResponseEntity<Rates> post(@RequestBody(required = false) String body) {
		
		logger.info(body);

		return ResponseEntity.ok(new Rates());
	}
	
}
