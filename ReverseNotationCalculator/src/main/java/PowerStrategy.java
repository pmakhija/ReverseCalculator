package main.java;

public class PowerStrategy implements IBinaryOperator{

	@Override
	public double calculate(double operand1, double operand2) {
		double result = 1;
	    for (int j = 0; j < operand2; j++) {
	        result *= operand1;
	    }
		return result;
	}
	

}
