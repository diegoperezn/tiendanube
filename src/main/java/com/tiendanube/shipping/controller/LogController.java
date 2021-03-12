package com.tiendanube.shipping.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

	Logger logger = LoggerFactory.getLogger(LogController.class);

	@GetMapping
	public ResponseEntity<String> logGet() {

		return ResponseEntity.ok("Success");
	}

	@PostMapping
	public ResponseEntity<String> logPost(@RequestBody(required = false) String body) {
		
		logger.info(body);

		return ResponseEntity.ok("Success");
	}

}
