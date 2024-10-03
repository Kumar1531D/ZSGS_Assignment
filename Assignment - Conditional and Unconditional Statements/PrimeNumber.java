package assignment2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Prime Numbers between 1 to 30 : ");
		
		for(int i=2;i<=30;i++) {
			boolean isPrime = true;
			
			for(int j=2;j<Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.print(i + " ");
			}
		}

	}

}
