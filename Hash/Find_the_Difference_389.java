package Hash;


import java.util.HashMap;
import java.util.Map;

public class Find_the_Difference_389 {
	
	public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> data = new HashMap<>();
        char[] ss = s.toCharArray();
        for(int i = 0;i < ss.length;i++){
        	data.put(ss[i], data.getOrDefault(ss[i], 0) + 1);
        }
        char[] tt  = t.toCharArray();
        for(int i = 0;i < tt.length;i++){
        	if(!data.containsKey(tt[i])){
        		return tt[i];
        	}else{
        		data.put(tt[i], data.get(tt[i]) - 1);
        	}
        }
        for(Map.Entry<Character, Integer> entry:data.entrySet()){
        	if(entry.getValue() < 0){
        		return entry.getKey();
        	}
        }
        return 0;
    }
}
