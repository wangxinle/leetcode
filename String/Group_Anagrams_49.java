package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams_49 {

	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        HashMap<String, List<String>> data = new HashMap<>();
        for(String str:strs){
        	char[] temp = str.toCharArray();
        	Arrays.sort(temp);
        	String s = String.valueOf(temp);
        	if(data.containsKey(s)){
        		List<String> value = data.get(s);
        		value.add(str);
        		data.put(s, value);
        	}else{
        		ArrayList<String> value = new ArrayList<>();
        		value.add(str);
        		data.put(s, value);
        	}
        }
        
        return new ArrayList<List<String>>(data.values());
    }
}
