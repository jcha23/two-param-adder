package com.pttbc.twoparamadder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ComponentScan(basePackages={"com.pttbc"})
public class TwoParamAdderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoParamAdderApplication.class, args);
	}

}
