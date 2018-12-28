package kata;

import java.util.ArrayList;

public class Format_words_into_a_sentence {

    public static void main(String[] args) {
	System.out.println(formatWords(new String[] { "one", "two", "three", "four" }));
	System.out.println(formatWords(new String[] { "ninja", "", null, "ronin" }));
	System.out.println(formatWords(new String[] { "one", "two", "" }));
	System.out.println(formatWords(new String[] { "one" }));
	System.out.println(formatWords(new String[] {}));
	System.out.println(formatWords(new String[] { null }));
	System.out.println(formatWords(null));
	System.out.println(formatWords(new String[] { "" }));

    }

    public static String formatWords(String[] words) {
	String result = "";
	ArrayList<String> list = new ArrayList<String>();
	if (words == null) {
	    return result;
	}
	
	// check array by case format in to list
	for (int i = 0; i < words.length; i++) {
	    if (words[i] != null && !words[i].isEmpty()) {
		list.add(words[i]);
	    }
	} 
	
	// add "and" in to sentence
	if (list.size() >= 2) {
	    list.add(list.size() - 1, "and");
	}

	for (int i = 0; i < list.size(); i++) {
	    if (list.size() > 3 & i < list.size() - 3) {
		result = result + " " + list.get(i) + ",";
	    } else {
		result = result + " " + list.get(i);
	    }
	}
	return result.trim();
    }
}
