package LeetCode;

public class First_Bad_Version_278 {
	
	public boolean isBadVersion(int n){
		return true;
	}
	
	public int firstBadVersion(int n) {
		int begin = 1;
		int end = n;
		int middle = begin + (end - begin)/2;
		while(begin < end){
			if(isBadVersion(middle)){
				end = middle;
				middle = begin + (end - begin)/2;
			}else{
				begin = middle+1;
			}
		}
		return begin;
		        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
