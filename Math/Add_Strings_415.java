package Math;

public class Add_Strings_415 {
	
	public String reverseString(String data){
		String result = "";
		char[] temp = data.toCharArray();
		for(int i = temp.length - 1;i >= 0;i--){
			result += temp[i];
		}
		return result;
	}
	
	public String addStrings(String num1, String num2) {
        String result = "";
        int length1 = num1.length();
        int length2 = num2.length();
        char[] numTemp1 = reverseString(num1).toCharArray();
        char[] numTemp2 = reverseString(num2).toCharArray();
        int flag = 0;
        for(int i = 0;i < length1 && i < length2;i++){
        	int temp = Integer.parseInt(String.valueOf(numTemp1[i])) + Integer.parseInt(String.valueOf(numTemp2[i]))  + flag;
        	if(temp  < 10){
        		result += temp;
        		flag = 0;
        	}else{
        		flag = 1;
        		result += temp -10;
        	}
        }
        if(length1 < length2){
        	
        	for(int i = length1;i < length2;i ++){
        		int temp = Integer.parseInt(String.valueOf(numTemp2[i])) + flag;
            	if(temp < 10){
            		result += temp;
            		flag = 0;
            	}else{
            		flag = 1;
            		result += temp - 10;
            	}
        	}
        }else{
        	for(int i = length2;i < length1;i ++){
        		int temp = Integer.parseInt(String.valueOf(numTemp1[i])) + flag;
            	if(temp < 10){
            		result += temp;
            		flag = 0;
            	}else{
            		flag = 1;
            		result += temp - 10;
            	}
        	}
        }
        if(flag == 1){
        	result += flag;
        }
        return reverseString(result);
    }
	
	public String addStrings_new(String num1,String num2){
		StringBuffer result = new StringBuffer();
		int flag = 0;
		for(int i = num1.length() -1 ,j = num2.length() - 1;i >= 0 || j >= 0 || flag == 1;i--,j--){
			int temp1 = (i < 0)?0:num1.charAt(i)-'0';
			int temp2 = (j < 0)?0:num2.charAt(j)-'0';
			result.append((temp1 + temp2 + flag)%10);
			flag = (temp1 + temp2 + flag)/10;
		}
		return result.reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new Add_Strings_415().addStrings_new("69694", "987734"));
		// TODO Auto-generated method stub

	}

}
