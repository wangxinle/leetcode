package Binary;

public class Pow {

	public double myPow(double x, int n) {
        if(n == 0 || x == 1.0) {
        	return 1;
        }
        if(n == Integer.MIN_VALUE){
        	return 0;
        }
        if(n < 0){
        	n = -n;
        	x = 1/x;
        }
        double number = 1;
        if(n%2 == 0){
        	 number = myPow(x*x,n/2);
        	
        }else{
        	 number = x*myPow(x*x,n/2);
        	
        }
        if(Double.isFinite(number)){
    		return 0;
    	}else{
    		return number;
    	}
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Double.MAX_VALUE);
		System.out.println(new Pow().myPow(1.0000, 2147483647));
		
	}

}
