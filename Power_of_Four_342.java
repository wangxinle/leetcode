package LeetCode;

public class Power_of_Four_342 {


	public boolean isPowerOfFour(int num) {
		for(int i = 0;i < 16;i++){
			if(num == (int)((Math.pow(4,i)))){
				return true;
			}
		}
		return false;    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Power_of_Four_342().isPowerOfFour(26));
	}

}
