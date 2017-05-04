package Array;

public class Find_Peak_Element_162 {

	public int findPeakElement(int[] nums) {
        if(nums.length == 0){
        	return 0;
        }else if(nums.length == 2){
        	if(nums[0] < nums[1]){
        		return 1;
        	}else{
        		return 0;
        	}
        }else{
        	int start = 0;
        	int end = nums.length - 1;
        	while(start < end){
        		int middle = (start + end)/2;
        	
            	if((middle == 0 || nums[middle] > nums[middle-1]) && (middle == nums.length -1 || nums[middle] > nums[middle+1])){
            		return middle;
            	}else if(nums[middle] < nums[middle+1] && ( middle == 0 || nums[middle] > nums[middle - 1] )){
            		start = middle+1;
            	}else{
            		end = middle-1;
            	}
        	}
        	return start;
        	
        }
    }
	
}
