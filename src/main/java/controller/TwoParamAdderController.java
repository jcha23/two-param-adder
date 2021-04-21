package controller;

import dto.TwoParamAdderResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TwoParamAdderController {
	
	
	@GetMapping("/sum/{num1}/{num2}")
	@ResponseBody
	public String getTwoParamAdder(@PathVariable String num1, @PathVariable String num2) {
		TwoParamAdderResponse twoParamAdderResponse = new TwoParamAdderResponse(num1, num2);
		String responseJson = "{\"sum\": \"" + twoParamAdderResponse.getSum() + "\"}";
		return responseJson;
	}
}
