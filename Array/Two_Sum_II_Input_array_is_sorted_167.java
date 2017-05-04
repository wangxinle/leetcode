package Array;

public class Two_Sum_II_Input_array_is_sorted_167 {

	public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int begin = 0;
        int end = numbers.length-1;
        while(true){
        	if(numbers[begin] + numbers[end] == target){
        		result[0] = begin + 1;
        		result[1] = end + 1;
        		break;
        	}else if(numbers[begin] + numbers[end] < target){
        		begin += 1;
        	}else{
        		end -= 1;
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
