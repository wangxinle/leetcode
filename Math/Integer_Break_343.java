package Math;

public class Integer_Break_343 {

	public int integerBreak(int n) {
        int[] dp = new int[n + 1];
       dp[1] = 1;
       for(int i = 2; i <= n; i ++) {
           for(int j = 1; j < i; j ++) {
               dp[i] = Math.max(dp[i], (Math.max(j,dp[j])) * (Math.max(i - j, dp[i - j])));
           }
       }
      
       System.out.println(dp[n]);
       
       return dp[n];
    }
	
	public int integerBreakMax(int n){
		if(n == 2){
			return 1;
		}else if(n == 3){
			return 2;
		}else{
			int result = 1;
			while(n > 4){
				result *= 3;
				n -= 3;
			}
			result *= n;
			System.out.println(result);
			return result;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Integer_Break_343().integerBreak(30);
		new Integer_Break_343().integerBreakMax(30);
	}

}
