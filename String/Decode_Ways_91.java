package String;

public class Decode_Ways_91 {

	public int numDecodings(String s) {
		
		
		 int n = s.length();
	        if (n == 0) return 0;
	        
	        int[] memo = new int[n+1];
	        memo[n]  = 1;
	        memo[n-1] = s.charAt(n-1) != '0' ? 1 : 0;
	        
	        for (int i = n - 2; i >= 0; i--)
	            if (s.charAt(i) == '0') continue;
	            else memo[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? memo[i+1]+memo[i+2] : memo[i+1];
	        
	        for(int i = n;i >= 0;i--){
	        	System.out.println(memo[i]);
	        	
	        }
	        return memo[0];
//		int result = 0;
//        if(s == null || s.length() == 0){
//        	return result;
//        }
//        
//        if(s.length() == 1){
//            if(s.startsWith("0")){
//                result = 0;
//                return result;
//            }
//        	result = 1;
//        	return result;
//        }else{
//        	String temp = s.substring(1, s.length());
//        	if(!temp.startsWith("0")){
//        		result += numDecodings(temp);
//        	}
//        	
//    		if(s.length() > 1){
//    			String temp2 = s.substring(2, s.length());
//    			String t2 = s.substring(0,2);
//    			if(Integer.parseInt(t2) <= 26){
//    				if(s.length() == 2){
//    					result += 1;
//    				}else{
//    					result += numDecodings(temp2);
//    				}
//    				
//    			}
//    		}
//        	
//        }
//        return result;
    }
	
	public static void main(String[] args){
		System.out.println(new Decode_Ways_91().numDecodings("1234"));
	}
	
	
	

}
