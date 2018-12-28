package kata;

public class LargestDifference {

    public static void main(String[] args) {
	System.out.println(largestDifference(new int[] { 9, 4, 1, 10, 3, 4, 0, -1, -2 }));
	System.out.println(largestDifference(new int[] { 3, 2, 1 }));

    }

    public static int largestDifference(int[] data) {

	int distance = 0;
	for (int i = 0; i < data.length; i++) {
	    for (int j = i; j < data.length; j++) {
		if (data[i] <= data[j] & (j-i)>distance) {
		    distance = j - i;
		}
	    }
	}

	return distance;

    }
}
