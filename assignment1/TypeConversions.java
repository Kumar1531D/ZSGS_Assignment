package assignment1;

public class TypeConversions {

	public static void main(String[] args) {
		
		char charValue = 'A';
		byte byteValue = 30;
		short shortValue = byteValue;
		int intValue = shortValue;
		long longValue = intValue;
		float floatValue = longValue;
		double doubleValue = floatValue;
		int charToInt = charValue;
		
		System.out.println("Implicit Type Conversion");
		System.out.println("Byte Value : " + byteValue);
		System.out.println("byte to short : " + shortValue);
		System.out.println("short to int : " + intValue);
		System.out.println("int to long : " + longValue);
		System.out.println("char to int : " + charToInt);
		System.out.println("long to float : " + floatValue);
		System.out.println("float to double : " + doubleValue+"\n");
		
		double originalDoubleValue = 153.10;
		
		floatValue = (float)originalDoubleValue;
		longValue = (long)floatValue;
		intValue = (int)longValue;
		shortValue = (short)intValue;
		byteValue = (byte)shortValue;
		char intToChar =(char) charToInt;
		
		System.out.println("Explicit Type Conversion");
		System.out.println("Double Value : " + originalDoubleValue);
		System.out.println("double to float : " + floatValue);
		System.out.println("float to long : " + longValue);
		System.out.println("long to int : " + intValue);
		System.out.println("int to short : " + shortValue);
		System.out.println("short to byte : " + byteValue);
		System.out.println("int to char : " + intToChar);
		

	}

}

/* Output
Implicit Type Conversion
Byte Value : 30
byte to short : 30
short to int : 30
int to long : 30
char to int : 65
long to float : 30.0
float to double : 30.0

Explicit Type Conversion
Double Value : 153.1
double to float : 153.1
float to long : 153
long to int : 153
int to short : 153
short to byte : -103
int to char : A

*/
