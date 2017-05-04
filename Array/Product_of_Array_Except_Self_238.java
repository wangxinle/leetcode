package Array;

public class Product_of_Array_Except_Self_238 {
	
	public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int temp = 1;
        for(int i = 0;i < nums.length;i++){
        	result[i] = temp;
        	temp *= nums[i];
        }
        temp = 1;
        for(int i = nums.length - 1;i >= 0;i--){
        	result[i] *= temp;
        	temp *= nums[i];
        }
        for(int i = 0;i < result.length;i++){
        	System.out.println(result[i]);
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5}; 
		System.out.println(new Product_of_Array_Except_Self_238().productExceptSelf(nums));
	}

}
