package LeetCode;

public class Power_of_Three_326 {

	public boolean isPowerOfThree(int n) {
		if(n == 0){
			return false;
		}else if(n == 1){
			return true;
		}else{
			while(true){
				if(n%3 != 0){
					return false;
				}else{
					n = n/3;
					if(n == 1){
						return true;
					}
				}
			}
			
		}		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Power_of_Three_326().isPowerOfThree(17));
	}

}
