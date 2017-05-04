package Array;

public class Maximum_Subarray_53 {

	public int maxSubArray(int[] nums) {
		
        int result = nums[0];
        int max = nums[0];
        for(int i = 1;i < nums.length;i++){
        	if(result + nums[i] >= 0){
        		if(result < 0){
        			result = 0;
        		}
        		result += nums[i];
        	}else{
        		result = nums[i];
        	}
        	if(result > max){
        		max = result;
        	}
        }
        return max;
    }
	
	public int maxSubArray_new(int[] nums) {
		
        int result = nums[0];
        int max = nums[0];
        for(int i = 1;i < nums.length;i++){
        	if( result >= 0){
        		result += nums[i];
        	}else{
        		result = nums[i];
        	}
        	if(result > max){
        		max = result;
        	}
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {-2,1,-3,4,-1,2,1,-5,4};
//		int[] data = {-2};
		System.out.println(new Maximum_Subarray_53().maxSubArray_new(data));
	}

}
