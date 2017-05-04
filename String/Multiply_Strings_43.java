package String;

public class Multiply_Strings_43 {
	
	public String multiply(String num1, String num2) {
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int[] data = new int[n1.length + n2.length];
        for(int i = n1.length-1;i >= 0;i--){
        	for(int j = n2.length-1;j >= 0;j--){
        		int mul = (n1[i] - '0')*(n2[j] - '0');
        		int p1 = i + j;
        		int p2 = i + j + 1;
        		mul +=  data[p2];
        		data[p1] += mul / 10;
        		data[p2] = mul % 10;
        	}
        }
        StringBuffer result = new StringBuffer();
        for(Integer i : data){
        	if(!(result.length() == 0 && i == 0)){
        		result.append(i);
        	}
        }
        
        return result.length() == 0?"0":result.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Multiply_Strings_43().multiply("12", "123"));
	}

}
