package Math;

public class MinTime {
	
	public int getTime(int num){
		
		if(isSqrt(num)){
			return 1;
		}
		while(num % 4 == 0){
			num /= 4;
		}
		if(num % 8 == 7){
			return 4;
		}
		for(int i = 0;i*i < num;i++){
			if(isSqrt(num - i*i)){
				return 2;
			}
		}
		return 3;
	}
	
	public boolean isSqrt(int n){
		int m = (int)Math.sqrt(n);
		if(m * m == n){
			return true;
		}else{
			return false;
		}
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new MinTime().getTime(160));
	}

}
