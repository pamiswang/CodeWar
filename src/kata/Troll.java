package kata;

public class Troll
{

	public static void main(String[] args)
	{
		System.out.println(   disemvowel("This website is for losers LOL!"));
	}

	public static String disemvowel(String str)
	{
		return str.replaceAll("[aeiouAEIOU]","");
	}
}