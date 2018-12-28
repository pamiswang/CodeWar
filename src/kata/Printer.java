package kata;

public class Printer
{
	public static void main(String[] args)
	{
		String s = "aabbccdzz";
		System.out.println(printerError(s));
		
		check("aabbccd");
		
		
	}

	public static String printerError(String s)
	{
		String check = "aaabbbbhaijjjm";
		String str = s;
		if (s.length() >= check.length() & s.matches("[a-z]*"))
		{
			str= str.replaceAll("[a-m]*", "");
		}
		return  str.length() + "/" + s.length();
	}




	public static void check(String s)
	{
		for(char i = 'a'  ; i <='m'; i++)
		{
		System.out.println(i+ "="+ (s.length()-  s.replace(String.valueOf((char)i ), "").length() ) );
		}
	}








}
