package LeetCode;

public class Length_of_Last_Word_58 {

	public int lengthOfLastWord(String s) {
		String[] data = s.split(" ");
		if(data.length == 0){
			return 0;
		}
		return data[data.length - 1].length(); 
		//return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Length_of_Last_Word_58().lengthOfLastWord(" "));
	}

}
