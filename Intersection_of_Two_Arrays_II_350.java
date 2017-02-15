package LeetCode;

import java.util.Arrays;

public class Intersection_of_Two_Arrays_II_350 {

	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int l1 = nums1.length;
		int l2 = nums2.length;
		int max = 0;
		if(l1 < l2){
			max = l1;		
		}else{
			max =l2;
		}
		int[] temp = new int[max];
		int i = 0,j = 0,k = 0;
		while(i < l1 && j < l2){
			if(nums1[i] == nums2[j]){
				temp[k] = nums1[i];
				i++;
				j++;
				k++;
			}else if(nums1[i] < nums2[j]){
				i++;
			}else{
				j++;
			}
		}
		int[] result = new int[k];
		for(int ii = 0;ii < k;ii++){
			result[ii] = temp[ii];
		}
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
