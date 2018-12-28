package kata;

public class Vasya_Clerk
{

	public static void main(String[] args)
	{
		System.out.println(Tickets(new int[] { 25, 25, 25, 100 }));

	}

	public static String Tickets(int[] peopleInLine)
	{
		int count_25 = 0;
		int count_50 = 0;
		int count_100 = 0;
		int money = 0;
		boolean enough = true;
		for (int i = 0; i < peopleInLine.length; i++)
		{
			switch (peopleInLine[i])// 計算收到的貨幣別數量
			{
			case 25:
				count_25++;
				break;
			case 50:
				count_50++;
				break;
			case 100:
				count_100++;
				break;
			}
			money = peopleInLine[i] - 25;// 計算找錢
			while (money >= 50 & count_50 > 0)// 計算可以給多少個50
			{
				count_50--;
				money = money - 50;
			}
			while (money >= 25 & count_25 > 0)// 計算可以給多少個25
			{
				count_25--;
				money = money - 25;
			}
			if (money != 0)// 判斷是否可以完全找零
			{
				enough = false;
				break;// 失敗就離開迴圈
			}
		}
		return (enough ? "YES" : "NO");
	}
}
