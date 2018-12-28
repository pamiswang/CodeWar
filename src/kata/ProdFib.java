package kata;


public class ProdFib
{

	public static void main(String[] args)
	{
		System.out.println(productFib(4896));
	}

	public static long[] productFib(long prod)
	{
		long[] r = new long[] { 0, 1, 0 };
		long t = 0;
		while (r[0] * r[1] < prod)
		{
			t = r[0];
			r[0] = r[1];
			r[1] = t + r[0];
		};

		if (r[0] * r[1] == prod)
		{
			r[2] = 1;
		}
		return r;
	}

	
	public static long[] calcFib(long prod)//»¼°jºâªk
	{
		long[] r = new long[3];
		r[2] = 0;
		long n = 0;
		do
		{
			r[0] = Fib(n);
			r[1] = Fib(n + 1);
			n++;
		} while (r[0] * r[1] < prod);
		if (r[0] * r[1] == prod)
		{
			r[2] = 1;
		}
		return r;
	}

	public static long Fib(long n)
	{
		if (n == 0)
		{
			return 0;
		} else if (n == 1)
		{
			return 1;
		}
		return Fib(n - 1) + Fib(n - 2);
	}
}
