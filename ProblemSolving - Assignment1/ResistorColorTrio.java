package artOfProblemSolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ResistorColorTrio {
	
	public static Map<String,Integer> resistors = new HashMap<>();
	
    public static String label(String[] colors) {
        StringBuilder value = new StringBuilder("");

        value.append(resistors.get(colors[0]));

        value.append(resistors.get(colors[1]));

        int size = resistors.get(colors[2]);

        for(int i = 0; i<size ; i++){
        	value.append("0");    

        }

        long num = Long.parseLong(value.toString());

        String result;

        if(num >= 1000000000){
            result = (num/1000000000) + " gigaohms";
        }   
        else if(num >= 1000000) {       
            result = (num/1000000) + " megaohms";
        }
        else if(num >= 1000) {
            result = (num/1000) + " kiloohms";
        }
        else {
            result = num + " ohms";
        }
        return result;

    }

	public static void main(String[] args) {
		
		resistors.put("black", 0);
		resistors.put("brown", 1);
		resistors.put("red", 2);
		resistors.put("orange", 3);
		resistors.put("yellow", 4);
		resistors.put("green", 5);
		resistors.put("blue", 6);
		resistors.put("violet", 7);
		resistors.put("grey", 8);
		resistors.put("white", 9);
		
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		
		String colors[] = new String[size];
		
		for(int i=0;i<size;i++) {
			colors[i] = in.next();
		}
		
		String ans = label(colors);
		
		System.out.println(ans);
	}

}
