package kata;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Kata13December {
	
	
	public static void main(String[] args)
	{
		//List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(-1,-1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
		List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(-1, 0, -1, 0, 0, -1, -1, -1, -1, 0, -1, -1, 0, 0, -1, 0, 0, -1, -1, 0, 0, -1, 0, -1, -1, 0, 0, 0, -1, 0));
		System.out.println(filterOddNumber(listOfNumbers));
	}
	
	public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
		for (int i = 0; i < listOfNumbers.size(); i++)
        {
        	if (listOfNumbers.get(i)%2 == 0 | listOfNumbers.get(i)==0 )
            {
            	listOfNumbers.remove(i);
            	i=0;
            }
        }
        return listOfNumbers;
    }
}