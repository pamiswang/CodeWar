package kata;

public class Multiples_of_3_or_5
{

	public static void main(String[] args)
	{
		System.out.println(solution(10));
		System.out.println(solution(10));
	}

	public static int solution(int n)
	{
		int sum = 0;
		for (int i = 1; i < n; i++)
		{
			if (i % 3 == 0 || i % 5 == 0)
			{
				sum = sum + i;
			}
		}

		return sum;
	}
}
