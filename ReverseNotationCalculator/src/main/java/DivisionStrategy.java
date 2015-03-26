package main.java;

public class DivisionStrategy implements IBinaryOperator{

	@Override
	public double calculate(double operand1, double operand2) {
		return operand1/operand2;
	}

}
