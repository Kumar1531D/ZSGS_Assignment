package assignment_ExceptionHandling;

public class CalculatorConundrum {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		try {
			System.out.println(calculator.calculate(16, 51, "+"));
			System.out.println(calculator.calculate(32, 6, "*"));
			System.out.println(calculator.calculate(512, 4, "/"));
			
			System.out.println(calculator.calculate(512, 0, "/"));
			
		} catch (IllegalOperationException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(calculator.calculate(10, 1, null));
		} catch (IllegalArgumentException | IllegalOperationException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(calculator.calculate(10, 1, ""));
		} catch (IllegalArgumentException | IllegalOperationException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(calculator.calculate(10, 1, "-"));
		} catch (IllegalOperationException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

class IllegalOperationException extends Exception{
	
	IllegalOperationException(String msg){
		super(msg);
	}
	
	IllegalOperationException(String msg,Throwable cause){
		super(msg,cause);
	}
	
}

class Calculator{
	
	public String calculate(int operand1,int operand2,String operation) throws IllegalOperationException {
		
		if(operation==null) {
			throw new IllegalArgumentException("Operation cannot be null");
		}
		
		if(operation.isEmpty())
			throw new IllegalArgumentException("Operation cannot be empty");
		
		
		String result;
		
		switch(operation) {
			case "+":
				result = operand1 +" + "+operand2 +" = " + (operand1+operand2);
				break;
			case "*":
				result = operand1 +" * "+operand2 +" = " + (operand1*operand2);
				break;
			case "/":
				if(operand2==0)
					throw new IllegalOperationException("Division by zero is not allowed",new ArithmeticException());
				
				result = operand1 +" / "+operand2 +" = " + (operand1/operand2);
				break;
				
			default:
				throw new IllegalOperationException("Operation "+operation+" does not exist.");
		}
		
		return result;
		
	}
	
}
