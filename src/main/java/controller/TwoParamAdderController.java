package controller;

import dto.TwoParamAdderResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/backend")
public class TwoParamAdderController {
	
	@RequestMapping(value = "/sum/{num1}/{num2}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getTwoParamAdder(@PathVariable Long num1, @PathVariable Long num2) {
		TwoParamAdderResponse twoParamAdderResponse = new TwoParamAdderResponse(num1, num2);
		String responseJson = "{\"sum\": \"" + twoParamAdderResponse.getSum() + "\"}";
		return new ResponseEntity<>(responseJson, HttpStatus.OK);
	}
}
