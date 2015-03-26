package main.java;
import java.util.Stack;




public class RPNPostFix {
	
	public double calculate(String[] arr) throws Exception{
		
		Stack<Double> inputStack = new Stack<Double>();
		for(int i=0; i<arr.length; i++){

			try{
				inputStack.push(Double.parseDouble(arr[i]));
			}catch(Exception e){
				
				if(String.valueOf( arr[i] ).matches( "[-+*^/]" )){
					double rightVariable = inputStack.pop();
					double leftVariable = inputStack.pop();
					inputStack.push(OperatorFactory.getBinaryOperations(arr[i]).calculate(leftVariable,rightVariable));
				}
				else if(String.valueOf( arr[i] ).matches( "[%!/]" )){
					double operand = inputStack.pop();
					inputStack.push(OperatorFactory.getUnaryOperations(arr[i]).calculate(operand));
				}
			}
		}
		return inputStack.pop();
	}

}
