package LeetCode;

public class Intersection_of_Two_Arrays_349 {
    
	public class Solution {
		   public  int[] arraySort(int[] nums){
				for(int i = 0; i < nums.length-1;i++){
					for(int j = i+1;j < nums.length;j++){
						if(nums[i] > nums[j]){
							int temp = nums[i];
							nums[i] =nums[j];
							nums[j] = temp;
						}
					}
				}
				return nums;
			}
			public  int[] intersection(int[] num1, int[] num2) {
				int[] nums1 = new int[num1.length];
				int[] nums2 = new int[num2.length];
				nums1 = arraySort(num1);
				nums2 = arraySort(num2);
				
				String result = "";
				//
				int i = 0,j=0;
				int k = 0;
				while(i < nums1.length && j < nums2.length){
					if(nums1[i] == nums2[j]){
						if(!result.contains(","+nums1[i]+",")){
							result += ","+nums1[i]+",";
							k++;
						}
						//result[k] = nums1[i];
						i++;
						j++;
						
					}else if(nums1[i] > nums2[j]){
						j++;
					}else{
						i++;
					}
				}
				int[] data =new int[k];
				String[] temp = result.split(",");
				int ii = 0;
				for(i = 0;i < temp.length;i++){
					if(temp[i].equals("")){
						continue;
					}else{
						data[ii] = Integer.parseInt(temp[i]);
						ii++;
					}
				}
				return data;
		    }
		}
	
	public static void main(String[] args) {

	}

}
