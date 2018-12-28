package kata;


public class DRoot
{

	public static void main(String[] args)
	{
		System.out.println(digital_root2(815));

	}

	public static int digital_root(int n)
	{
		char[] S = String.valueOf(n).toCharArray();
		int result = 0;
		for (int i = 0; i < S.length; i++)
		{
			result += (S[i] - '0');
		}
		if (result > 10)
		{
			return digital_root(result);
		}
		return result;
	}

	public static int digital_root2(int n)
	{
		return (n != 0 && n % 9 == 0) ? 9 : n % 9;
	}

}
