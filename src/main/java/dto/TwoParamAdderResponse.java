package dto;

public class TwoParamAdderResponse {
	private int sum;
	
	public TwoParamAdderResponse(String num1, String num2) {
		this.sum = Integer.parseInt(num1) + Integer.parseInt(num2);
	}
	
	public int getSum() {
		return sum;
	}
}
