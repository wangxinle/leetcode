package String;

public class Repeated_Substring_Pattern_459 {

	public boolean repeatedSubstringPattern_new(String s) {
        boolean judge = false;
        if(s.length() == 1){
        	return judge;
        }
        for(int i = 1;i <= s.length()/2;i++){
        	if(s.length() % i == 0){
        		String sub = s.substring(0, i);
                
            	StringBuffer temp = new StringBuffer();
            	for(int j = 0;j < s.length()/i;j++){
            		temp.append(sub);
            		
            	}
            	if(s.equals(temp.toString())){
            		judge = true;
            		return judge;
            	}
        	}
        	
        	
        }
        
        return judge;
    }
	
	public boolean repeatedSubstringPattern(String str) {
        //This is the kmp issue
        int[] prefix = kmp(str);
        for(int i = 0;i < prefix.length;i++){
        	System.out.println(prefix[i]);
        }
        
        int len = prefix[str.length()-1];
//        System.out.println(len);
        int n = str.length();
        return (len > 0 && n%(n-len) == 0);
    }
    private int[] kmp(String s){
        int len = s.length();
        int[] res = new int[len];
        char[] ch = s.toCharArray();
        int i = 0, j = 1;
        res[0] = 0;
        while(i < ch.length && j < ch.length){
            if(ch[j] == ch[i]){
                res[j] = i+1;
                i++;
                j++;
            }else{
                if(i == 0){
                    res[j] = 0;
                    j++;
                }else{
                    i = res[i-1];
//                    System.out.println(i);
                }
            }
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Repeated_Substring_Pattern_459().repeatedSubstringPattern("abcabcabc"));
	}

}
