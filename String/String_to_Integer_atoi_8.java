package String;

public class String_to_Integer_atoi_8 {
	
	public int myAtoi(String str) {
        str = str.replace(" ", "");
        int sign = 1;
        int i = 0;
        if(str.startsWith("+")){
        	i = 1;
        }
        if(str.startsWith("-")){
        	sign = -1;
        	i = 1;
        }
        char[] data =str.toCharArray();
        int result = 0;
        for(int j = i;j < data.length;j++){
        	if(result > Integer.MAX_VALUE/10 || (result >= Integer.MAX_VALUE/10 && data[j] - '0' > (Integer.MAX_VALUE%10))){
        		if(sign == 1){
        			return Integer.MAX_VALUE;
        		}else{
        			return Integer.MIN_VALUE;
        		}
        	}
        	result = result*10 + (data[j]-'0');
        	System.out.println(data[j] - '0');
        }
        
        
        return result*sign;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new String_to_Integer_atoi_8().myAtoi("123"));

	}

}
