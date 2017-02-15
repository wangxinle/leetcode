package LeetCode;

public class Implement_strStr_28 {
	
	public int strStr(String haystack, String needle) {
		if(needle.length() > haystack.length()){
			return -1;
		}else{
			for(int i = 0;i < haystack.length() -needle.length()+1;i++){
				if(haystack.substring(i, i+needle.length()).equals(needle)){
					return i;
				}
			}
		}
		return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Implement_strStr_28().strStr("aaabb", "ab"));
	}

}
