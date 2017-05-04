package Array;

import java.util.HashMap;
import java.util.Map;

public class K_diff_Pairs_in_an_Array_532 {

	public int findPairs(int[] nums, int k) {
        int result = 0;
        if(nums == null || nums.length == 0 || k < 0){
        	return result;
        }
        HashMap<Integer, Integer> data = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
        	data.put(nums[i], data.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry:data.entrySet()){
        	if(k == 0){
        		if(entry.getValue() >= 2){
        			result += 1;
        		}
        	}else{
        		if(data.containsKey(entry.getKey() + k)){
        			result += 1;
        		}
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3, 1, 4, 1, 5};
		System.out.println(new K_diff_Pairs_in_an_Array_532().findPairs(data, 0));
	}

}
