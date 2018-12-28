package kata;



import java.util.LinkedList;
import java.util.Queue;

public class Line
{
	public static void main(String[] args)
	{
		String[] names = new String[] { "A", "B", "C", "D", "E" };
		//System.out.println(WhoIsNext(names, 16));
		System.out.println(WhoIsNext2(names, 5));
		System.out.println(WhoIsNext2(names, 15));
		System.out.println(WhoIsNext2(names, 35));
		System.out.println(WhoIsNext2(names, 75));
		System.out.println(WhoIsNext2(names, 8));		
		System.out.println(WhoIsNext2(names, 20));		
		System.out.println(WhoIsNext2(names, 44));		
		
		
		//System.out.println(WhoIsNext2(names, 155));

//		System.out.println(WhoIsNext2(names, 15));
//		System.out.println(WhoIsNext2(names, 16));
//		System.out.println(WhoIsNext2(names, 18));
		//System.out.println(WhoIsNext3(names, 16));
	}

	public static String WhoIsNext(String[] names, int n)
	{
		int m = 0, // 循環所需要的可樂數量
				round = 0, // 循環次數
				p = names.length, // 目前人數
				index = 0;

		while ((m + p) < n)
		{
			m = m + p;
			round += 1;
			p = (int) (names.length * Math.pow(2, round));
		}
		index = ((n - m - 1) / (int) Math.pow(2, round));
		return names[index];
	}
	
	
	public static String WhoIsNext2(String[] names, int n)
	{
		Queue<String> queue = new LinkedList<String>();
		String list = "";
		for (String s : names)
		{
			queue.offer(s);
		}
		for (int i = 1; i <= n; i++)
		{
			list = queue.peek();
			queue.poll();
			queue.offer(list);
			queue.offer(list);
		}
		System.out.println("喝掉的可樂瓶數" + "= " + n);
		System.out.println("隊伍順序   " + queue.toString());
		System.out.println("隊伍人數   " + queue.size());
		return list;

	}
	/**
	 * 
	 * @param names
	 * @param n
	 * @return
	 */
	  public static String WhoIsNext3(String[] names, int n){
	    while ( n > names.length){
	    	
	      n = (n - (names.length - 1)) / 2;
	    }
	    return names[n-1];
	  }
}	