package LeetCode;

public class Excel_Sheet_Column_Number_171 {

	public int titleToNumber(String s) {
		int result = 0;
        char[] data = s.toCharArray();
        for(int i = data.length - 1;i >= 0;i--){
        	result += ((int)data[i]-64)*Math.pow(26, data.length - 1- i);
        }
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Excel_Sheet_Column_Number_171().titleToNumber("AA"));
	}

}
