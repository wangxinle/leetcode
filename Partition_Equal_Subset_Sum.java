package LeetCode;

import java.util.Arrays;

public class Partition_Equal_Subset_Sum {
 
	public boolean canPartition(int[] nums) {
		
		if(nums.length == 1){
			return false;
		}
		int sum = 0;
		for(int i = 0;i < nums.length;i++){
			sum += nums[i];
		}
		if(sum % 2 != 0){
			return false;
		}
		Arrays.sort(nums);
		
		
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
