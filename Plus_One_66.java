package LeetCode;

public class Plus_One_66 {

	public int[] plusOne(int[] digits) {
		int[] result = new int[digits.length+1];
		int j = result.length - 1;
		digits[digits.length-1] += 1;
		for(int i = digits.length -1 ;i >= 0;i--){
			if(digits[i] == 10){
				result[j--] = 0;
				if(i-1>=0){
					digits[i-1] += 1;
				}else{
					result[0] = 1;
					//digits[i-1] = 1;
				}
				
			}else{
				result[j--] = digits[i];
			}
		}
		if(result[0] == 1){
			return result;
		}else{
			int[] new_result = new int[result.length - 1];
			for(int i = 0;i < new_result.length;i++){
				new_result[i] = result[i+1];
			}
			return new_result;
		}
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
