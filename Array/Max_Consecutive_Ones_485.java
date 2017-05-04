package Array;

public class Max_Consecutive_Ones_485 {

	public int findMaxConsecutiveOnes(int[] nums) {
		int result = 0;
		int max = 0;
		for(int i = 0;i < nums.length;i++){
			if(nums[i] == 1){
				max += 1;
			}else{
				if(max > result){
					result = max;
				}
				max = 0;
			}
		}
		if(max > result){
			result = max;
		}
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
