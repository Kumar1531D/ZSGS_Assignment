package assignment_methodOverloading;

public class MathOperations {
	
	public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

	public static void main(String[] args) {
		
		MathOperations mathOperations = new MathOperations();
		
        System.out.println("Integer Addition: " + mathOperations.add(10, 5));
        System.out.println("Integer Subtraction: " + mathOperations.subtract(10, 5));
        System.out.println("Integer Multiplication: " + mathOperations.multiply(10, 5));
        System.out.println("Integer Division: " + mathOperations.divide(10, 5));
        
        System.out.println(	);

        System.out.println("Double Addition: " + mathOperations.add(10.5, 5.2));
        System.out.println("Double Subtraction: " + mathOperations.subtract(10.5, 5.2));
        System.out.println("Double Multiplication: " + mathOperations.multiply(10.5, 5.2));
        System.out.println("Double Division: " + mathOperations.divide(10.5, 5.2));

	}

}

