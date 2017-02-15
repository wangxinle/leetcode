package LeetCode;

public class Reverse_String_344 {

    public String reverseString(String s) {
        char[] data = s.toCharArray();
        
        for(int i = data.length-1;i >=data.length/2 ;i--){
        	char temp = data[i];
        	data[i] = data[data.length-i-1];
        	data[data.length-i-1] = temp;
        }
        
        return new String(data);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_String_344 solution = new Reverse_String_344();
		System.out.println(solution.reverseString("123"));
	}

}
