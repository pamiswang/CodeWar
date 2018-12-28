package kata;


public class Solution
{

	public static void main(String[] args)
	{
		System.out.println(camelCase("test case"));
		System.out.println(camelCase("camel case method"));
		System.out.println(camelCase(" camel  case word"));
		System.out.println(camelCase("   "));
		System.out.println(camelCase("c"));
	}

	public static String camelCase(String str)
	{
		String[] s = str.trim().split(" +");
		String result = "";
		if (s[0].length() == 0)
		{
			return result;
		}
		for (String i : s)
		{
			result = result + (i.substring(0, 1).toUpperCase() + i.substring(1, i.length()));
		}
		return result;
	}
}
