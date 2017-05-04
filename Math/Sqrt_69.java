package Math;

public class Sqrt_69 {

	public int mySqrt(int x) {
        int result = 0;
        long begin = 0;
        long end = x;
        while(begin <= end){
        	
        	long middle = (begin + end)/2;
        	
        	if(middle * middle == x){
        		result = (int) middle;
        		break;
        	}else if(middle * middle < x){
        		result = (int) begin;
        		begin = middle + 1;
        		
        	}else{
        		
        		end = middle -1;
        		result = (int) end;
        		
        	}
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Sqrt_69().mySqrt(10));

	}

}
