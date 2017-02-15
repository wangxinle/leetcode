package LeetCode;

import java.util.Arrays;

public class Contains_Duplicate_217 {

	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i = 0;i < nums.length-1;i++){
			if(nums[i] == nums[i+1]){
				return true;
			}
		}
		return false;
//		int begin = 0;
//		int count = 0;
//		int i = 0;
//		while(true){			
//			while(i < nums.length && nums[i] == nums[begin]){
//				i++;
//				count++;
//			}
//			if(count < 2){
//				return false;
//			}else{
//				begin = i;
//				count = 0;
//			}
//			if(i == nums.length){
//				return true;
//			}
//		}		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = new int[3];
		temp[0] = 1;
		temp[1] = 2;
		temp[2] = 1;
		System.out.println(new Contains_Duplicate_217().containsDuplicate(temp));
	}

}
