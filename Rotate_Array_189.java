package LeetCode;

public class Rotate_Array_189 {

	public void rotate(int[] nums, int k) {
		if(nums.length == 0 || k == 0){
			return;
		}else{
			k = k%nums.length;
			if(k == 0){
			    return;
			}
			int i = 0;
			while(i < (nums.length-k)/2){
				int temp = nums[i];
				nums[i] =nums[nums.length-k-i-1];
				nums[nums.length-k-i-1] = temp;
				i++;
			}
			i = nums.length - k;
			while(i <nums.length-k/2){
				int temp = nums[i];
				nums[i] =nums[nums.length-i+nums.length - k - 1];
				nums[nums.length-i+nums.length - k - 1] = temp;
				i++;
			}
			i = 0;
			while(i < nums.length/2){
				int temp = nums[i];
				nums[i] = nums[nums.length-i-1];
				nums[nums.length-i-1] = temp;
				i++;
			}
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
