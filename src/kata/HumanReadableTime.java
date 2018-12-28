package kata;


public class HumanReadableTime
{

	public static void main(String[] args)
	{
		System.out.println(makeReadable(86399));
		System.out.println(makeReadable(0));
		System.out.println(makeReadable2(86399));
		System.out.println(makeReadable2(0));
	}

	public static String makeReadable(int seconds)
	{
		return String.format("%02d", seconds / 3600) + ":" + String.format("%02d", (seconds % 3600) / 60) + ":" + String.format("%02d", (seconds % 3600) % 60);
	}

	public static String makeReadable2(int seconds)
	{
		String HH = "";
		String MM = "";
		String SS = "";
		HH = String.format("%02d", seconds / 3600);
		seconds = seconds % 3600;
		MM = String.format("%02d", seconds / 60);
		seconds = seconds % 60;
		SS = String.format("%02d", seconds);
		return (HH + ":" + MM + ":" + SS);
	}

}
