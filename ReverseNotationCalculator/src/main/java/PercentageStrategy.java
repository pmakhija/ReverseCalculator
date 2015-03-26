package main.java;

public class PercentageStrategy implements IUnaryOperator {

	@Override
	public double calculate(double operand) {
		return operand/100;
	}

}
