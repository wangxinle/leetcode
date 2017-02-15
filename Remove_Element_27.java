package LeetCode;

import java.util.Arrays;

public class Remove_Element_27 {

	 public int removeElement(int[] nums, int val) {
		 Arrays.sort(nums);
		 
		 int result = 0;
		 int first = -1;
		 int end = -1;
		 
		 for(int i = 0;i < nums.length;i++){
			 if(nums[i] == val && first == -1){
				 first = i;
			 }
			 if(nums[i] == val){
				 end = i;
			 }
		 }
		 if(end == -1 && first == -1){
		     return nums.length;
		 }
		 result = nums.length - (end - first + 1);
		 if(first != -1 && end < nums.length-1){
			 for(int i = end+1;i < nums.length;i++){
				 nums[first] = nums[i];
				 first++;
			 }
		 }
		 
		 return result;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[4];
		data[0] = 3;
		data[1] = 2;
		data[2] = 2;
		data[3] = 3;
		System.out.println(new Remove_Element_27().removeElement(new int[0], 3));
	}

}
