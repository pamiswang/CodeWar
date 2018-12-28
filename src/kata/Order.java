package kata;

public class Order {

    public static void main(String[] args) {
	System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
	System.out.println(order("Empty input should return empty string"));

    }

    public static String order(String words) {
	String[] s = words.trim().split(" +");
	String result = "";
	if (words.indexOf("1") < 0) {
	    return result;
	}
	for (int i = 0; i < s.length; i++) {
	    for (int j = 0; j < s.length; j++) {
		if (s[j].indexOf(String.valueOf(i + 1)) >= 0) {
		    result = result + s[j] + " ";
		}
	    }
	}
	return result.substring(0, result.length() - 1);
    }
}
