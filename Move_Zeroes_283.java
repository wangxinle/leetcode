package LeetCode;

public class Move_Zeroes_283 {

	public void moveZeroes(int[] nums) {
		int i = 0;
		int j = 0;
		while(true){
			//0
			while(i < nums.length && nums[i] != 0){
				i++;
			}
			j = i+1;
			while(j < nums.length && nums[j] == 0){
				j++;
			}
			if(j >= nums.length){
			    return;
			}
			nums[i] = nums[j];
			nums[j] = 0;
			i = i+1;
		}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
