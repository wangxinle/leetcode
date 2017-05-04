package Array;

import java.util.ArrayList;
import java.util.List;
public class Subsets_78 {

	public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        int number = 1<<nums.length;
        for(int i = 0;i < number;i++){
        	ArrayList<Integer> temp = new ArrayList<>();
        	
        	for(int j = 0;j < nums.length;j++){
        		if(((i>>j)&1) == 1){
        			temp.add(nums[j]);
        		}
        	}
        	result.add(temp);
        }
        return result;
    }
	
	public static void main(String[] args){
		System.out.println((char)('A'^256^256));
	}
}
