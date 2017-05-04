package String;

import java.util.Arrays;

public class Next_Greater_Element_III_556 {
	
	public int nextGreaterElement(int n) {
        int result = -1;
        if(n < 10){
        	return result;
        }
        char[] data = (n + "").toCharArray();
        int i = data.length - 1;
        for(;i >= 1;i--){
        	if(data[i] > data[i-1]){
        		break;
        	}
        }
        if(i == 0){
        	return result;
        }
        
        int small = data[i - 1] - '0';
        int min = data[i] - '0';
        int k = i;
        int j;
        for(j = i; j < data.length;j++){
        	if(data[j] - '0'  > small && data[j] - '0' <= min ){
        		min = data[j];
        		k = j;
        	}
        }
        data[k] = data[i-1];
        data[i-1] = (char) (min);
        Arrays.sort(data,i,data.length);
        long val = Long.parseLong(new String(data));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Next_Greater_Element_III_556().nextGreaterElement(4321));
	}

}
