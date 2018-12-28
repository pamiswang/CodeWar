package kata;

public class LCS
{

	public static void main(String[] args)
	{
		System.out.println(lcs("abcdef", "acf"));
		System.out.println(lcs("nothardlythefinaltest", "zzzfinallyzzz"));
		System.out.println(lcs("anothertest", "notatest"));
	}

	static String lcs(String a, String b)
	{
		char[] m = new char[a.length()];
		char[] n = new char[b.length()];
		m = a.toCharArray();
		n = b.toCharArray();
		String result = "";

		for (int i = 0; i < n.length; i++)
		{
			for (int j = 0; j < m.length; j++)
			{
				if (n[i] == m[j])
				{
					result = result + String.valueOf(n[i]);
					break;
				}
			}

		}

		return result; // do it!
	}
}
