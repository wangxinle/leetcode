package Math;

public class Reverse_Integer_7 {
	
	public int reverse(int x) {
		if(x == 0){
            return x;
        }
		StringBuffer sb = new StringBuffer();
		sb.append(x);
		sb.reverse();
		String temp = x<0?"-":"";
		int length = x<0?sb.length()-1:sb.length();
		int flag = 0;
		for(int i = 0;i < length;i++){
			if(sb.charAt(i) != '0' && flag == 0){
				temp += sb.charAt(i);
				flag = 1;
			}else if(flag == 1){
				temp += sb.charAt(i);
			}
		}
		long number = Long.parseLong(temp);
		if(number < Integer.MIN_VALUE || number > Integer.MAX_VALUE){
			return 0;
		}
		return (int)number;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Reverse_Integer_7().reverse(-123013990));
	}

}
