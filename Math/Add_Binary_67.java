package Math;

public class Add_Binary_67 {

	public String addBinary(String a, String b) {
        StringBuffer result = new StringBuffer();
        int flag = 0;
        for(int i = a.length()-1,j = b.length()-1;i >=0 || j >= 0 || flag == 1;i--,j--){
        	int aa = i>=0?a.charAt(i) - '0':0;
        	int bb = j>=0?b.charAt(j) - '0':0;
        	int temp = aa + bb + flag;
        	result.append(temp%2);
        	flag = temp/2;
        }
        return result.reverse().toString();
    }
	
	public static void main(String[] args) {
		System.out.println(Integer.highestOneBit(5));
		System.out.println(~5);
		// TODO Auto-generated method stub
		System.out.println(new Add_Binary_67().addBinary("11001", "1111100"));
		
	}

}
