package dto;

public class TwoParamAdderResponse {
	private Long sum;
	
	public TwoParamAdderResponse(Long num1, Long num2) {
		this.sum = num1 + num2;
	}
	
	public Long getSum() {
		return sum;
	}
}
