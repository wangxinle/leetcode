package String;

public class Longest_Common_Prefix_14 {

	public String shortestString(String[] strs){
		String result = strs[0];
		for(int i = 0;i < strs.length;i++){
			if(strs[i].length() < result.length()){
				result = strs[i];
			}
		}
		return result;
	}
	public String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length == 0){
        	return result;
        }
        String minString = shortestString(strs);
        if(minString.length() == 0){
        	return result;
        }else{
        	for(int i = minString.length();i >= 0;i--){
        		String temp = minString.substring(0, i);
        		int j;
        		for(j = 0;j < strs.length;j++){
        			if(!strs[j].startsWith(temp)){
        				break;
        			}
        		}
        		if(j == strs.length){
        			
        			return temp;
        		}
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
