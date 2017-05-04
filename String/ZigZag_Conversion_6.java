package String;

public class ZigZag_Conversion_6 {


	public String convert(String s, int numRows) {
		if(numRows == 1){
			return s;
		}
        String result = "";
        char[] data = s.toCharArray();
        for(int i = 0;i < numRows;i++){
        	if(i == 0 || i == numRows - 1){
        		for(int j = i;j < data.length;j += 2*numRows - 2){
        			System.out.println(j);
        			result += data[j];
        		}
        	}else{
        		int begin = i;
        		int second = 2*numRows - 2- i;
        		for(int j = begin,k = second;j < data.length || k < data.length;j += 2*numRows - 2,k += 2*numRows - 2){
        			if(j < data.length){
        				result += data[j];
        			}
        			if(k < data.length){
        				result += data[k];
        			}
        			
        		}
        	}
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZigZag_Conversion_6 z = new ZigZag_Conversion_6();
		String result = z.convert("a", 1);
		System.out.println(result);
	}

}
