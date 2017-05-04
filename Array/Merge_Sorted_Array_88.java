package Array;


public class Merge_Sorted_Array_88 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1;
        int j = n -1;
        int index = m + n -1;
        while(i >= 0 && j >= 0){
        	if(nums1[i] > nums2[j]){
        		nums1[index] = nums1[i];
        		i--;
        	}else{
        		nums1[index] = nums2[j];
        		j--;
        	}
        	index--;
        }
        while(i >= 0){
        	nums1[index--] = nums1[i--];
        }
        while(j >= 0){
        	nums1[index--] = nums2[j--];
        }
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,4,6,7};
		int[] nums2 = {1};
		new Merge_Sorted_Array_88().merge(nums1, 0, nums2, 1);
	}

}
