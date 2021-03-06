package main.java;

public class FactorialStrategy implements IUnaryOperator{

	@Override
	public double calculate(double operand) throws Exception {
		double result = 1;
		if(operand < 0)
			throw new Exception("Factorial cannot be calculated for negative");
		
		for (int c = 1 ; c <= operand ; c++ )
            result = result*c;
 		
		return result;
	}
	

}
