package String;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_Words_in_a_String_151 {

	public String reverseWords(String s) {
		String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
