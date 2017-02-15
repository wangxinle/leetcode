package LeetCode;

import java.util.Arrays;

public class Valid_Anagram_242 {
	
	public static boolean isAnagram(String s, String t) {
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(t1);
		return String.valueOf(s1).equals(String.valueOf(t1));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("111sa", "as111"));
	}

}
