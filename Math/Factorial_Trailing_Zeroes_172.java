package Math;

public class Factorial_Trailing_Zeroes_172 {

	public int trailingZeroes(int n) {
		return n == 0?0:n/5 + trailingZeroes(n/5);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Factorial_Trailing_Zeroes_172().trailingZeroes(100000));
	}

}
