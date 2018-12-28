package kata;


public class PigLatin
{

	public static void main(String[] args)
	{
		System.out.println(pigIt("Pig latin is cool"));
		System.out.println(pigIt("This is my string"));
		System.out.println(pigIt("Hello world !"));
	}

	public static String pigIt(String str)
	{
		String[] s = str.split(" ");
		String result = "";
		for (int i = 0; i < s.length; i++)
		{
			if (s[i].matches("[a-zA-Z]*"))
			{
				s[i] = s[i].substring(1, s[i].length()) + s[i].substring(0, 1) + "ay";
			}
			result = result + s[i] + " ";
		}
		result=result.substring(0,result.length()-1);
		return result;
	}

}
