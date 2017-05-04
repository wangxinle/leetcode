package Math;

public class Valid_Perfect_Square_367 {

	public boolean isPerfectSquare(int num) {
        boolean judge = false;
        long begin = 0 ;
        long end = num;
        while(begin <= end){
        	System.out.println(begin);
//        	System.out.println(end);
        	long middle = (begin + end)/2;
        	if(middle * middle == num){
        		judge = true;
        		break;
        	}else if(middle*middle  > num){
        		end = middle-1;
        	}else{
        		begin = middle+1;
        	}
        }
        return judge;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Valid_Perfect_Square_367().isPerfectSquare(2147483647));
	}

}
