package LeetCode;

public class Add_Digits_258 {


	public static int addDigits(int num) {
		int result = 0;
		if(num < 10){
			return num;
		}else{
			int sum = 0;
			while(num > 0){
				
				sum += num-(num/10)*10;
				num = num/10;
			}
			result = addDigits(sum);
			
		}
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(1123));
	}

}
