package String;

import java.util.HashMap;
import java.util.Map;

public class Ransom_Note_383 {

	public boolean canConstruct(String ransomNote, String magazine) {
        boolean judge = true;
        HashMap<Character, Integer> maga = new HashMap<>();
        HashMap<Character, Integer> ran = new HashMap<>();
        for(int i = 0;i < magazine.length();i++){
        	maga.put(magazine.charAt(i), maga.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for(int i = 0;i < ransomNote.length();i++){
        	ran.put(ransomNote.charAt(i), ran.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for(Map.Entry<Character, Integer>entry:ran.entrySet()){
        	if(!maga.containsKey(entry.getKey())){
        		judge = false;
        		break;
        	}else{
        		if(maga.get(entry.getKey()) < entry.getValue()){
        			judge = false;
        			break;
        		}
        	}
        }
        return judge;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Ransom_Note_383().canConstruct("AB", "ABB"));
	}

}
