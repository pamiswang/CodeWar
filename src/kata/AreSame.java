package kata;

import java.util.Arrays;

public class AreSame
{

	public static void main(String[] args)
	{
		int[] a = new int[] { 121, -144, 19, 161, 19, 144, 19, 11 };
		int[] b = new int[] { 121, 14641, 20736, 361, 25921, 361, 20736, 361 };
		// System.out.println(Math.pow(0, 2));
		System.out.println(comp(a, b));
	}

	public static boolean comp(int[] a, int[] b)
	{
		if (a == null | b == null)
		{
			return false;
		} else if (a.length == 0 & b.length == 0)
		{
			return true;
		} else if (a.length == b.length)
		{
			for (int i = 0; i < a.length; i++)
			{
				a[i] = Math.abs(a[i]);
			}
			Arrays.sort(a);
			Arrays.sort(b);
			for (int i = 0; i < a.length; i++)
			{
				if (b[i] != (int) Math.pow(a[i], 2))
				{
					return false;
				}
			}
		} else
		{
			return false;
		}
		return true;
	}
}
