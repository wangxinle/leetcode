package LeetCode;

public class Ugly_Number_263 {

	
	public boolean isUgly(int num) {
		if(num == 1){
			return true;
		}
		while(true){
			if(num == 1){
				return true;
			}
			if(num%2 == 0){
				num = num/2;
			}
			else if(num%3 == 0){
				num = num/3;
			}
			else if(num%5 == 0){
				num = num/5;
			}else{
				return false;
			}
		}        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Ugly_Number_263().isUgly(14));
	}

}
