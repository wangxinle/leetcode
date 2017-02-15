package LeetCode;

public class Climbing_Stairs_70 {

	public int climbStairs(int n) {
    
		if(n == 1){
			return 1;
		}else if(n == 2){
			return 2;
		}else{
			return climbStairs(n-1)+climbStairs(n-2);
		}
    }
	public int climbStairs_1(int n){
		if(n == 1){
			return 1;
		}else if(n == 2){
			return 2;
		}else{
			int begin = 1;
			int next = 2;
			int result = 3;
			while(n > 3){
				n--;
				begin = next;
				next = result;
				result = begin+next;
			}
			return result;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Climbing_Stairs_70().climbStairs_1(115));
	}

}
