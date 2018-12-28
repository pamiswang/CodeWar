package kata;

public class Kata
{
	public static void main(String[] args)
	{

	}

	public static String high(String s)
	{
		String[] str = s.split(" ");
		int[] X = new int[str.length + 1];
		int index = 0;
		for (int i = 0; i < str.length; i++)
		{
			for (int j = 0; j < str[i].length(); j++)
			{
				X[i] += (int) str[i].toLowerCase().charAt(j) - 96;
			}
			if (X[X.length - 1] < X[i])
			{
				X[X.length - 1] = X[i];
				index = i;
			}
		}
		return str[index];
	}

}