package Math;

import java.util.Arrays;
import java.util.HashMap;

public class Dp {
	
	HashMap<Integer, Integer> index = new HashMap<>();
	
	
	public int numSquare(int n){
		if(n == 0){
			return 0;
		}
		if(index.containsKey(n)){
			return index.get(n);
		}
		int number = n;
		int sqrt = (int) Math.sqrt(n);
		if(sqrt * sqrt == n){
			return 1;
		}
		for(int i = sqrt;i >= 2;i--){
			if(i*i == n){
				return 1;
			}
			number = Math.min(number, numSquare(n - i*i)+1);
		}
		index.put(n, number);
		return number;
		
	}
	
	public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;

        for(int x : nums) {
            int i = Arrays.binarySearch(dp, 0, len, x);
            System.out.println(x+"!!"+i);
            if(i < 0) i = -(i + 1);
            dp[i] = x;
            System.out.println(x+"@@"+i);
            if(i == len) len++;
        }
        for(int i = 0;i < dp.length;i++){
//        	System.out.println(dp[i]);
        }
        System.out.println("@@@@"+len);
        return len;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(new Dp().numSquare(1027));
		int[] data = {10, 9, 2, 5, 3, 3, 7, 101, 18};
		int[] t = {10,9,8};
		new Dp().lengthOfLIS(data);
		System.out.println(Math.abs((long)-2147483648));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(-1/3);
	}

}
