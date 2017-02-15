package LeetCode;

public class Majority_Element_169 {

	public int majorityElement(int[] nums) {
		int count = 0;
		int result = nums[0];
		for(int i = 0;i < nums.length;i++){
			if(count == 0){
				result = nums[i];
				count++;
			}else{
				if(result == nums[i]){
					count++;
				}else{
					count--;
				}
			}
		}
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
