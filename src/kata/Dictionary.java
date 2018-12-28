package kata;


public class Dictionary
{

	public static void main(String[] args)
	{
		Dictionary dictionary = new Dictionary(new String[] { "cherry", "pineapple", "melon", "strawberry", "raspberry" });
		System.out.println(dictionary.findMostSimilar("berry"));

	}

	private final String[] words;

	public Dictionary(String[] words)
	{
		this.words = words;
	}

	public String findMostSimilar(String input)
	{
		int[] asum = new int[words.length];
		int maxindex = 0;
		int score = 0;
		System.out.println(input);
		for (int i = 0; i < words.length; i++)
		{
			System.out.println(words[i]);
			for (int j = 0; j < input.length(); j++)
			{
				if (words[i].indexOf(String.valueOf(input.charAt(j))) > 0)
				{
					asum[i] += 1;
				}
			}
		}
		for (int k = 0; k < asum.length; k++)
		{
			
			System.out.println(asum[k]);
			if (asum[k] > score)
			{
				score = asum[k];
				maxindex = k;
			}
		}
		return words[maxindex];
	}

}
