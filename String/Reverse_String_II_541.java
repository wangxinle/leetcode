package String;

public class Reverse_String_II_541 {

	public String reverseStr(String s, int k) {
        String result = "";
        char[] data = s.toCharArray();
        for(int i = 0;i < data.length;){
        	if(i + 2*k <= data.length){
        		for(int j = i+k-1;j >= i;j--){
        			result += data[j];
        		}
        		for(int j = i+k;j < i + 2*k;j++){
        			result += data[j];
        		}
        		i += 2*k;
        	}else if(i + k <= data.length){
        		for(int j = i+k-1;j >= i;j--){
        			result += data[j];
        		}
        		for(int j = i+k;j < data.length;j++){
        			result += data[j];
        		}
        		break;
        	}else{
        		for(int j = data.length-1;j >= i;j--){
        			result += data[j];
        		}
        		break;
        	}
        }
        
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Reverse_String_II_541().reverseStr("abcdefg", 8));
	}

}
