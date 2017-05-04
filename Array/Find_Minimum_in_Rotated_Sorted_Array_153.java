package Array;

public class Find_Minimum_in_Rotated_Sorted_Array_153 {

	public int findMin(int[] nums) {
		if(nums == null || nums.length == 0){
			return 0;
		}
        if( nums.length == 1){
        	return nums[0];
        }
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
        	int middle = (start + end)/2;
        	if(middle > 0 && nums[middle] < nums[middle-1]){
        		return nums[middle];
        	}
        	if(nums[middle] >= nums[start] && nums[middle] > nums[end]){
        		start = middle + 1;
        	}else{
        		end = middle - 1;
        	}
        }
        return nums[start];
    }
}
