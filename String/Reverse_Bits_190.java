package String;

import java.util.Arrays;

public class Reverse_Bits_190 {
	
	public int reverseBits(int n){
		int result = 0;
		for(int i= 0;i < 32;i++){
			result += n & 1;
			System.out.println(result);
			n >>= 1;
			if(i < 31){
				result <<= 1;
			}
			System.out.println(result);
			
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(new Reverse_Bits_190().reverseBits(43261596));
//		int[] data = {0,1,5};
//		System.out.println(Arrays.binarySearch(data, 4));
		System.out.println(Integer.toHexString(-10000 - Integer.MIN_VALUE));
		System.out.println(Integer.toHexString(-1));
		System.out.println(Integer.toHexString(10000 ));
		long a = 1;
		System.out.println((long)(a<<32));
		System.out.println(Long.toBinaryString((long)((a<<32) - 1)));
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println("11111111111111111111111111111111".length());
		System.out.println(-1&15);
		System.out.println(Integer.toBinaryString(-5));
		System.out.println(-5>>>4);
		System.out.println(-5>>2);
//		System.out.println(-/16);
		
		
	}

}
