package String;

public class Reverse_Words_in_a_String_III_557 {

	public String reverse(String temp){
		char[] data = temp.toCharArray();
		for(int i = 0;i < data.length/2;i++){
			char a = data[i];
			data[i] = data[data.length - i - 1];
			data[data.length - i - 1] = a;
			
		}
		return new String(data);
	}
	
	public String reverseWords(String s) {
        String[] data = s.trim().split(" ");
        for(int i = 0;i < data.length;i++){
        	data[i] = reverse(data[i]);
        }
        return String.join(" ", data);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Reverse_Words_in_a_String_III_557().reverseWords("i like you"));
	}

}
