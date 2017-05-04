package String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Longest_Uncommon_Subsequence_II_522 {
	
	public int findLUSlength(String[] strs) {
		
        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        HashMap<String,Integer> data = new HashMap<>();
        for(String str:strs){
        	if(data.containsKey(str)){
        		data.put(str, -1);
        	}else{
        		data.put(str, 1);
        		for(Map.Entry<String, Integer> entry:data.entrySet()){
    				if(entry.getKey().contains(str)){
    					data.put(str, -1);
    					break;
    				}
    			}
        		
        	}
        }
        int max = -1;
        for(Map.Entry<String, Integer> entry:data.entrySet()){
        	if(entry.getValue() != -1){
        		if(entry.getKey().length() > max){
        			max = entry.getKey().length();
        		}
        	}
        }
        
        return max;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
