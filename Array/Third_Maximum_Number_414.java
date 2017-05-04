package Array;

import java.util.HashSet;
import java.util.Iterator;

public class Third_Maximum_Number_414 {

	public int minNumber(HashSet<Integer> number){
		int result = 0;
		int flag = 0;
		for(Iterator<Integer> v=number.iterator();v.hasNext();){
			if(flag == 0){
				result = (int) v.next();
				flag = 1;
			}else{
				int temp = (int)v.next();
				if(temp < result){
					result = temp;
				}
			}
		}
		return result;
	}
	
	public int maxNumber(HashSet<Integer> number){
		int result = 0;
		int flag = 0;
		for(Iterator<Integer> v=number.iterator();v.hasNext();){
			if(flag == 0){
				result = (int) v.next();
				flag = 1;
			}else{
				int temp = (int)v.next();
				if(temp > result){
					result = temp;
				}
			}
		}
		return result;
	}
	
	public int thirdMax(int[] nums) {
		HashSet<Integer> number = new HashSet<>();
		
		for(int i = 0;i < nums.length;i++){
			if(number.size() < 3){
				number.add(nums[i]);
			}else{
				int min = minNumber(number);
				if(nums[i] > min){
					if(number.add(nums[i])){
						number.remove(min);
					}
					
					
				}
			}
		}
		if(number.size() < 3){
			return maxNumber(number);
		}else{
			return minNumber(number);
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 2, 2, 1};
		System.out.println(new Third_Maximum_Number_414().thirdMax(data));
	}

}
