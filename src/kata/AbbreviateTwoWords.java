package kata;

public class AbbreviateTwoWords
{
	public static void main(String[] args)
	{
		System.out.println(abbrevName("Sam Harris"));
		System.out.println(abbrevName("Patrick Feenan"));
	}

	public static String abbrevName(String name)
	{
		String[] s = name.split(" ") ;
		return s[0].substring(0, 1).toUpperCase() + "." + s[1].substring(0, 1).toUpperCase();
	}
}
