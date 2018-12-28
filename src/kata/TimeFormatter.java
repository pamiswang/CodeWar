package kata;

import java.util.ArrayList;

public class TimeFormatter
{

	public static void main(String[] args)
	{
		System.out.println(formatDuration(15731080));
		System.out.println(formatDuration(132030240));
		System.out.println(formatDuration(120));
		System.out.println(formatDuration(3600));
		System.out.println(formatDuration(3662));
	}

	public static String formatDuration(int seconds)
	{
		int Y = 31536000, D = 86400, H = 3600, M = 60, S = 60;
		int YY = 0, DD = 0, HH = 0, MM = 0, SS = 0, WW = 0, CC = 1;
		ArrayList<String> list = new ArrayList<String>();
		String YYF = " year", DDF = " day", HHF = " hour", MMF = " minute", SSF = " second";
		String result = "";
		if (seconds > 0)
		{
			/* 時間計算 */
			YY = seconds / Y;
			DD = (seconds % Y) / D;
			HH = (seconds % D) / H;
			MM = (seconds % H) / M;
			SS = ((seconds % M) % S);
			/* 單複數轉換 */
			if (YY > 1)
			{
				YYF = " years";
			}
			if (DD > 1)
			{
				DDF = " days";
			}
			if (HH > 1)
			{
				HHF = " hours";
			}
			if (MM > 1)
			{
				MMF = " minutes";
			}
			if (SS > 1)
			{
				SSF = " seconds";
			}
			/* 有值的才加入陣列 */
			if (YY != 0)
			{
				list.add(YY + YYF);
			}
			if (DD != 0)
			{
				list.add(DD + DDF);
			}
			if (HH != 0)
			{
				list.add(HH + HHF);
			}
			if (MM != 0)
			{
				list.add(MM + MMF);
			}

			if (SS != 0)
			{
				list.add(SS + SSF);
			}
			/* 逗點與and加入的處理 */
			WW = list.size();
			while (WW > 1)
			{
				if (WW > 2)
				{
					list.add(CC, ", ");
				}
				if (WW == 2)
				{
					list.add(CC, " and ");
				}
				CC = CC + 2;
				WW--;
			}
			/*輸出串接*/
			for (int i = 0; i < list.size(); i++)
			{
				result = result + list.get(i);
			}

		} else
		{
			result = "now";
		}

		return result;
	}
}
