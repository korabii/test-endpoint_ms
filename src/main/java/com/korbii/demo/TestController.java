package com.korbii.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"*"})
public class TestController {

	@GetMapping
	public ResponseEntity<String> testEndPoint(){
		
		return ResponseEntity.ok("successfully reached the endpoint");
	}
}
