package kata;

public class Convert_string_to_camel_case {

    public static void main(String[] args) {
	String input = "the-stealth-warrior";
	System.out.println("input: " + input);
	System.out.println(toCamelCase(input));

    }

    public static String toCamelCase(String s) {
	String[] str = s.split("-|_");
	String result = str[0];

	for (int i = 1; i < str.length; i++) {
	    str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1, str[i].length());
	    result = result + str[i];
	}

	return result;
    }
}
