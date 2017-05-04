package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_39 {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
	
	public void helper(List<List<Integer>> result,ArrayList<Integer> temp,int[] nums,int target,int start){
		if(target < 0){
			return;
		}else if(target == 0){
			result.add(new ArrayList<Integer>(temp));
			return;
		}else{
			for(int i = start;i < nums.length;i++){
				temp.add(nums[i]);
				helper(result, temp, nums, target - nums[i], i);
				temp.remove(temp.size() - 1);
			}
		}
	}
}
