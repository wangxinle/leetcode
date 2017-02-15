package LeetCode;

public class Add_Strings_415 {

	public static String reverse(String s) {
		  int length = s.length();
		  String reverse = "";
		  for (int i = 0; i < length; i++)
		   reverse = s.charAt(i) + reverse;
		  return reverse;
	}
	public String addStrings(String  num1,String num2){
		String result = "";
		char[] n1 = num1.toCharArray();
		char[] n2 = num2.toCharArray();
		int i = n1.length - 1;
		int j = n2.length - 1;
		int flag = 0;
		while(i >= 0 && j >= 0){
			int n = n1[i]+n2[j]-96+flag;
			if(n > 9){
				result += (n-10);
				flag = 1;
			}else{
				result += n;
				flag = 0;
			}
			i--;
			j--;
		}
		if(i < 0 && j >= 0){
			while(j >= 0){
				int n = n2[j]-48 + flag;
				if(n > 9){
					result += (n-10);
					flag = 1;
				}else{
					result += n;
					flag = 0;
				}
				j--;
			}
			if(flag > 0){
				result +=  flag;
			}
		}
		else if(j < 0 && i >= 0){
			while(i >= 0){
				int n = n1[i]-48 + flag;
				if(n > 9){
					result += (n-10);
					flag = 1;
				}else{
					result += n;
					flag = 0;
				}
				i--;
			}
			if(flag > 0){
				result +=  flag;
			}
		}else{
			if(flag > 0){
				result +=  flag;
			}
			
		}
		
		return reverse(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Add_Strings_415().addStrings("99123", "98734"));
	}

}
