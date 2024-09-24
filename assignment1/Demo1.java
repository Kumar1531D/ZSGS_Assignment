package assignment1;

public class Demo1 {

	public static void main(String[] args) {
		
		Demo2 demo2 = new Demo2();
		Demo3 demo3 = new Demo3();
		Demo4 demo4 = new Demo4();
		
		demo2.getDetails();
		demo3.getDetails();
		demo4.getDetails();

	}

}

class Demo2{
	
	public void getDetails() {
		System.out.println("This is Demo2");
	}
	
}

class Demo3{
	
	public void getDetails() {
		System.out.println("This is Demo3");
	}
	
}

class Demo4{
	
	public void getDetails() {
		System.out.println("This is Demo4");
	}
	
}

/* After compiling this code 4 .class files are created
 * 
 * Demo1.class
 * Demo2.class
 * Demo3.class
 * Demo4.class
 * 
 * 
  output:
  	This is Demo2
	This is Demo3
	This is Demo4
 * 
 * 
 */
