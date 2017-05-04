package Math;



public class Arranging_Coins_441 {

	 public int arrangeCoins(int n) {
	        int result = 0;
	        result =(int) ((Math.sqrt(n) * Math.sqrt(2) - 0.5) );
	        
	        while(true){
	        	if(result % 2 == 0){
	        		if(result <= 65535 && result / 2 * (result + 1) <= n){
	        			result += 1;
	        		}else{
	        			result -= 1;
	        			break;
	        		}
	        	}else{
	        		if( result <= 65535 && (result + 1) / 2 * result <= n){
	        			result += 1;
	        		}else{
	        			result -= 1;
	        			break;
	        		}
	        	}
//	        	System.out.println(result);
	        }
	        return result;
	 }
	 
	 public static void main(String[] args){
		 System.out.println(Integer.MAX_VALUE);
		 
		 System.out.println(new Arranging_Coins_441().arrangeCoins(2147483647));
		 System.out.println((int)(Math.sqrt(1 + 8 *(long)2147483647)/2 -0.5 ));
	 }
	
}
