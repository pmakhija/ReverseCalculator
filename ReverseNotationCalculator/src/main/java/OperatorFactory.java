package main.java;

import java.util.HashMap;

public class OperatorFactory {

	public static HashMap<String, IBinaryOperator> BinaryOperations = new HashMap<String, IBinaryOperator>();
	public static HashMap<String, IUnaryOperator> UnaryOperations= new HashMap<String, IUnaryOperator>();;
	
	static
	{
		BinaryOperations.put("+", new AdditionStrategy());
		BinaryOperations.put("-", new SubtractionStrategy());
		BinaryOperations.put("*", new MultiplicationStrategy());
		BinaryOperations.put("/", new DivisionStrategy());
		BinaryOperations.put("^", new PowerStrategy());
		UnaryOperations.put("%", new PercentageStrategy());
		UnaryOperations.put("!", new FactorialStrategy());
	}
	
	public static IBinaryOperator getBinaryOperations(String operator) {
		return BinaryOperations.get(operator);
	}
	public static IUnaryOperator getUnaryOperations(String operator) {
		return UnaryOperations.get(operator);
	}
}
