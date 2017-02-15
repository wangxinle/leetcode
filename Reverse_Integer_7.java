package LeetCode;

public class Reverse_Integer_7 {
	
	public int reverse(int x) {
		if(x < 10 && x > -10){
			return x;
		}else{
			int flag = 1;
			if(x < 0){
				flag = -1;
			}
			x = Math.abs(x);
			String data = x+"";		
			char[] temp = data.toCharArray();
			for(int i = 0;i < temp.length/2;i++){
				char tt = temp[i];
				temp[i] = temp[temp.length - i-1];
				temp[temp.length - i - 1] = tt;
			}
			String result = "";
			int first = 0;
			for(int i = 0;i < temp.length;i++){
				if(temp[i] == '0' && first == 0){
					continue;
				}else{
					result += temp[i];
					first = 1;
				}
			}
			long result_num = ((long)(Double.parseDouble(result)))*flag;
			System.out.println(result_num);
			if(result_num > Integer.MAX_VALUE || result_num < Integer.MIN_VALUE){
				return 0;
			}
			return (int)result_num;
		}
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Reverse_Integer_7().reverse(-2147483648));
	}

}
