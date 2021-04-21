package com.pttbc.twoparamadder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.TwoParamAdderResponse;

@Controller
@SpringBootApplication
public class TwoParamAdderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoParamAdderApplication.class, args);
	}
	
	@RequestMapping("/{num1}/{num2}")
	public TwoParamAdderResponse getTwoParamAdder(@PathVariable Long num1, @PathVariable Long num2) {
		return new TwoParamAdderResponse(num1, num2);
	}
}
