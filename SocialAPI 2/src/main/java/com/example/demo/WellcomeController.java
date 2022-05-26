package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WellcomeController {
	
	@RequestMapping("/wellcome")
	public static String Wellcome() {
		return "Wellcome to my spring boot app";
	}

}
