package Array;

public class Remove_Duplicates_from_Sorted_Array_II_80 {

	public int removeDuplicates(int[] nums) {
        int result = 0;
        if(nums == null || nums.length == 0){
        	return result;
        }
        int i = 0;
        for(int n:nums){
        	if(i < 2 || n > nums[i-2]){
        		nums[i++] = n;
        	}
        }   
        
        return i;
        
    }
	
	public static void main(String[] args){
		int[] data = {1,1,1,2,2,3,3,3};
		System.out.println(new Remove_Duplicates_from_Sorted_Array_II_80().removeDuplicates(data));
	}
}
