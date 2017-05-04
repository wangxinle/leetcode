package Array;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array_442 {

	public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
        	int index = Math.abs(nums[i]) - 1;
        	if(nums[index] < 0){
        		result.add(Math.abs(nums[i]));
        	}else{
        		nums[index] = -nums[index];
        	}
        	
        }
        return result;
    }
	
	public static void main(String[] args){
		int[] data = {10,2,5,10,9,1,1,4,3,7};
		System.out.println(new Find_All_Duplicates_in_an_Array_442().findDuplicates(data));
	}
}
