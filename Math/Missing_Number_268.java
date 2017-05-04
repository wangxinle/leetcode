package Math;

public class Missing_Number_268 {

	public int missingNumber(int[] nums) {
        int result = 0;
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
        	sum += nums[i] - i;
        }
        result = nums.length - sum;
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,4,5};
		System.out.println(new Missing_Number_268().missingNumber(nums));
	}

}
