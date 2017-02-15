package LeetCode;

public class Power_of_Two_231 {

	public boolean isPowerOfTwo(int n) {
		if(n==0){
			return false;
		}
		if(n ==1){
			return true;
		}
		while(true){
			if(n%2 != 0){
				return false;
			}else{
				n = n/2;
				if(n == 1){
					return true;
				}
			}
		}
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Power_of_Two_231().isPowerOfTwo(0));
	}

}
