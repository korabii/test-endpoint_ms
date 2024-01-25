package com.korbii.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping(path = "hello")
public class TestController {

	
	@GetMapping("test")
	public ResponseEntity<String> testEndPoint2(){
		
		return ResponseEntity.ok("successfully reached the endpoint");
	}
}
