package com.example.simplepro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class personcontroller {
		@GetMapping(path="/saveProduct")
		public String saveProduct() {
			return "Person saved.";
		}
		@GetMapping(path="/getProduct")
		public String getProduct() {
			return "Person";
	 
		
	}

}
