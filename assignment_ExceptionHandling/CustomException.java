package assignment_ExceptionHandling;

public class CustomException {

	public static void main(String[] args) {
		
		try {
			checkTemp(-300);
		}
		catch(TempMismatchException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void checkTemp(int temp) throws TempMismatchException {
		int MIN = -273;
		int MAX = 1000;
		
		if(temp<MIN || temp>MAX) {
			throw new TempMismatchException("Temparature "+temp+" is out of range!");
		}
		else {
			System.out.println("Temparature is valid");
		}
	}

}



class TempMismatchException extends Exception{
	
	TempMismatchException(String msg){
		super(msg);
	}
}
