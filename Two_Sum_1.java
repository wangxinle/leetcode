package LeetCode;


public class Two_Sum_1 {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		//Arrays.sort(nums);
		for(int i = 0;i < nums.length -1;i++){
			for(int j = i+1;j < nums.length;j++){
				if(nums[i]+nums[j] == target){
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		
		return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
