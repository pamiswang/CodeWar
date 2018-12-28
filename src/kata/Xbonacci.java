package kata;

import java.util.Arrays;

public class Xbonacci
{

	public static void main(String[] args)
	{
		System.out.println(tribonacci(new double[] { 8, 14, 13 }, 5));

	}

	public static double[] tribonacci(double[] s, int n)
	{
		 double[] result=Arrays.copyOf(s, n);
	      for(int i=3;i<n;i++){
	    	  result[i]=result[i-1]+result[i-2]+result[i-3];
		      }
	      return result;
	}
	
}