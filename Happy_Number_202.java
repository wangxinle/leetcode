package LeetCode;

import java.util.ArrayList;

public class Happy_Number_202 {

	public int newPower(int n){
		int result = 0;
		while(n > 0){
			result += (n%10)*(n%10);
			n = n/10;
		}
		return result;
	}
	
	public boolean isHappy(int n) {
		if(n == 1){
			return true;
		}
		ArrayList<Integer> data = new ArrayList<>();
		data.add(n);
		while(true){
			int temp = newPower(n);
			if(temp == 1){
				return true;
			}
			if(data.contains(temp)){
				return false;
			}else{
				data.add(temp);
				n = temp;
			}
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Happy_Number_202().isHappy(2));
	}

}
