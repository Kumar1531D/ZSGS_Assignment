package exercism2;
import java.util.*;
public class RainDrops 
{
    public static void main(String[] args) 
    {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=in.nextInt();
		String sound=rainDrop(num);
		System.out.println(sound);
		in.close();
	}
    public static String rainDrop(int num)
    {
        StringBuilder sound=new StringBuilder();
        if(num%3==0)
        	sound.append("Pling");
        if(num%5==0)
        	sound.append("Plang");
        if(num%7==0)
        	sound.append("Plong");
        if(sound.isEmpty())
        	sound.append(num);
        return sound.toString();
    }
}
