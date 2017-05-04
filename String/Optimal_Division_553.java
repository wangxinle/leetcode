package String;

public class Optimal_Division_553 {

	public String optimalDivision(int[] nums) {
		StringBuffer result = new StringBuffer();
		result.append(nums[0]);
		for(int i = 1;i < nums.length;i++){
			if(i == 1 && nums.length > 2){
				result.append("/(" + nums[i]);
			}else{
				result.append("/" + nums[i]);
			}
		}
		
		return nums.length > 2?result.append(")").toString():result.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {10,100};
		System.out.println(new Optimal_Division_553().optimalDivision(data));
	}

}
