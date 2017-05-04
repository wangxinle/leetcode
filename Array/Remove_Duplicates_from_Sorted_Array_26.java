package Array;

public class Remove_Duplicates_from_Sorted_Array_26 {

	public int removeDuplicates(int[] nums) {
        int result = 0;
        int id = 0;
        for(int i = 0;i < nums.length;i++){
        	if(i+1 < nums.length){
        		if(nums[i] != nums[i+1]){
        			nums[id] = nums[i];
        			id += 1;
        			result += 1;
        		}
        	}else{
        		nums[id] = nums[i];
        		result += 1;
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
