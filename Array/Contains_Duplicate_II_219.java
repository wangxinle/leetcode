package Array;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_II_219 {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,0,1,1};
		System.out.println(new Contains_Duplicate_II_219().containsNearbyDuplicate(data, 1));
	}

}
