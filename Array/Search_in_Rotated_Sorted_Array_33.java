package Array;

public class Search_in_Rotated_Sorted_Array_33 {

	public boolean search(int[] nums, int target) {
        
		if(nums == null || nums.length == 0){
			return false;
		}
		int begin = 0;
		int end = nums.length - 1;
		while(begin <= end){
			int middle = (begin + end) / 2;
			
			if(nums[middle] == target){
				return true;
			}
			
			if(nums[begin]  < nums[middle]){
				if(nums[middle] > target && target > nums[begin]){
					end  = middle - 1;
				}else{
					begin = middle;
				}
			}
			
			if(nums[middle]  < nums[end]){
				if(nums[middle]  < target && target < nums[end]){
					begin = middle + 1;
				}else{
					end = middle;
				}
			}
		}
		return false;
    }
}
