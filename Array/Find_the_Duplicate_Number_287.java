package Array;

public class Find_the_Duplicate_Number_287 {

	public int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[nums[0]];
		while (slow != fast)
		{
			slow = nums[slow];
			fast = nums[nums[fast]];
		}

		fast = 0;
		while (fast != slow)
		{
			fast = nums[fast];
			slow = nums[slow];
		}
		return slow;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1};
		System.out.println(new Find_the_Duplicate_Number_287().findDuplicate(nums));
	}

}
