package exercism2;

public class BottleSong 
{
    public static void main(String[] args) 
    {
		String lyrics=getLyrics();
		System.out.println(lyrics);
	}
    public static String getLyrics()
    {
    	String[] num = {"No", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
    	StringBuilder lyrics=new StringBuilder();
    	for (int i = 10; i > 0; i--)
    	{
            lyrics.append(num[i] + " green bottles hanging on the wall,\n");
            lyrics.append(num[i] + " green bottles hanging on the wall,\n");
            lyrics.append("And if one green bottle should accidentally fall,\n");
            lyrics.append("There'll be " +num[i-1].toLowerCase()+ " green bottles hanging on the wall.\n");
            lyrics.append('\n');
        }
    	return lyrics.toString();
    }
}
