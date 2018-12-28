package kata;

public class Accumul
{

	public static void main(String[] args)
	{

		System.out.println(accum("ZpglnRxqenU"));

	}

	public static String accum(String s)
	{
		String t = "";

		for (int i = 0; i < s.length(); i++)
		{
			t = t + s.substring(i, i + 1).toUpperCase();
			for (int j = 0; j < i; j++)
			{
				t = t + s.substring(i, i + 1).toLowerCase();
			}
			t = t + "-";
		}
		t = t.substring(0, t.length() - 1);
		return t;

	}

}