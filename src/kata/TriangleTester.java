package kata;

public class TriangleTester
{

	public static void main(String[] args)
	{
		System.out.println(isTriangle(1, 2, 2));

	}

	public static boolean isTriangle(int a, int b, int c)
	{
		if (a + b > c & b + c > a & a + c > b)
		{
			return true;
		} else
		{
			return false;
		}

	}
}
