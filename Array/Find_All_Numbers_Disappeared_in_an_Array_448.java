package Array;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array_448 {

	public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
        	int temp = nums[i];
        	
        		while(temp != 0){
        			int next = nums[temp-1];
                	nums[temp-1] = 0;
                	temp = next;
        		}
            	
        	
        	
        }
        for(int i = 0;i < nums.length;i++){
        	if(nums[i] != 0){
        		result.add(i+1);
        	}
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
