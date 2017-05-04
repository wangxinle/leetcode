package Array;


public class Search_Insert_Position_35 {

	public int searchInsert(int[] nums, int target) {
        int result = 0;
        for(int i = 0;i < nums.length;i++){
        	if(nums[i] == target){
        		result = i;
        		break;
        	}else if(nums[i] < target){
        		if(i+1 < nums.length){
        			if(nums[i+1] >= target){
        				result = i+1;
        				break;
        			}
        		}else{
        			result = nums.length;
        			break;
        		}
        	}else{
        		result = i;
        		break;
        	}
        }
        return result;
    }
	
	public int searchInsert_new(int[] nums, int target){
		int result = -1;
		int begin = 0;
		int end = nums.length - 1;
		while(begin <= end){
			int middle = (begin + end)/2;
			if(nums[middle] < target){
				begin = middle + 1;
			}else if(nums[middle] > target){
				end = middle - 1;
			}else{
				result = middle;
				break;
			}
		}
		if(result == -1){
			result = begin;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
