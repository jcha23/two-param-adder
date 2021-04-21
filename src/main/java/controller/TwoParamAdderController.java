package controller;

import dto.TwoParamAdderResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class TwoParamAdderController {
	
	@GetMapping("/{num1}/{num2}")
	public TwoParamAdderResponse getTwoParamAdder(@PathVariable Long num1, @PathVariable Long num2) {
		return new TwoParamAdderResponse(num1, num2);
	}
}
