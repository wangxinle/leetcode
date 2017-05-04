package Math;

public class Nth_Digit_400 {

	public int findNthDigit(int n) {
        int number = 9;
        int bit = 1;
        while((n-1)/number >=  bit){
//        	System.out.println(number * bit);
        	System.out.println(n);
        	n -= number * bit;
        	number = number * 10;
        	bit++;
        }
        System.out.println(n);
        int a = (int) Math.pow(10, bit-1) + (n-1) / bit;
        int b = (n-1) % bit;
        System.out.println(a);
        System.out.println(b);
        return Character.getNumericValue(String.valueOf(a).charAt(b));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Nth_Digit_400().findNthDigit(9));
		
	}

}
