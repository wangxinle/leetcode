package Array;

public class Jump_Game_55 {

	public boolean canJump(int[] nums) {
       
		
		for(int i = nums.length - 2;i >= 0;i--){
			if(nums[i] == 0){
				int step = 1;
				while(step > nums[i]){
					step += 1;
					i--;
					if(i < 0){
						return false;
					}
				}
			}
		}
		return true;
        
    }
}
