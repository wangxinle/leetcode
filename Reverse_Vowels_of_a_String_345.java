package LeetCode;

public class Reverse_Vowels_of_a_String_345 {

	public String reverseVowels(String s) {
    
		char[] data = s.toCharArray();
		int[] recode = new int[data.length];
		int j = 0;
		for(int i = 0;i < data.length;i++){
			if(data[i] == 'a' || data[i] == 'e' || data[i] == 'i' || data[i] == 'o' || data[i] == 'u'){
				recode[j] = i;
				j++;
			}
		}
		for(int i = 0;i < j/2;i++){
			int ii = recode[i];
			int jj = recode[j - i - 1];
			char temp = data[ii];
			data[ii] = data[jj];
			data[jj] = temp;
			
		}
		return new String(data);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Reverse_Vowels_of_a_String_345().reverseVowels("leetcode"));
	}

}
