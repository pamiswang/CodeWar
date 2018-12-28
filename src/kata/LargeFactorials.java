package kata;

import java.math.BigInteger;

public class LargeFactorials
{

	public static void main(String[] args)
	{
	    System.out.println(Factorial(1));
	    System.out.println(Factorial(5));
	    System.out.println(Factorial(9));
	    System.out.println(Factorial(15));
	}

	public static String Factorial(int n)
	{
		BigInteger ftb = new BigInteger("1");
		for (int i = 1; i <= n ; i++)
		{
			ftb = ftb.multiply(BigInteger.valueOf(i));
		}		
		return ftb.toString();
	}

}
