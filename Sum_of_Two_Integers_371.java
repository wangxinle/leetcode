package LeetCode;

public class Sum_of_Two_Integers_371 {

	public int getSum(int a, int b) {
	    int sum = a;
	    if(b == 0 ){
	    	return sum;
	    }
    	sum = a^b;
    	int temp = (a&b)<<1;    	
    	sum = getSum(sum, temp);    
	    return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_of_Two_Integers_371 sum_of_Two_Integers_371 = new Sum_of_Two_Integers_371();
		System.out.println(sum_of_Two_Integers_371.getSum(14, 5));
	}

}
