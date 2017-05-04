package Hash;

import java.util.ArrayList;
import java.util.HashMap;

public class Keyboard_Row_500 {

	public String[] findWords(String[] words) {
        
        String[] keyTemp = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        hashCode();
        HashMap<Character, Integer> keyAll = new HashMap<>();
        for(int i = 0;i < keyTemp.length;i++){
        	for(int j = 0;j < keyTemp[i].toCharArray().length;j++){
        		keyAll.put(keyTemp[i].toCharArray()[j], i);
        	}
        }
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0;i < words.length;i++){
        	String word = words[i].toLowerCase();
        	if(word.length() == 1){
        		result.add(words[i]);
        		continue;
        	}
        	int flag = keyAll.get(word.toCharArray()[0]);
        	int judge = 0;
        	for(int j = 1;j < word.toCharArray().length;j++){
        		if(flag != keyAll.get(word.toCharArray()[j])){
        			judge = 1;
        			break;
        		}
        	}
        	if(judge == 0){
        		result.add(words[i]);
        	}
        }
        String[] resultFinal = new String[result.size()];
        for(int i = 0;i < result.size();i++){
        	resultFinal[i] = result.get(i);
        }
        return resultFinal;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] temp = {"Hello", "Alaska", "Dad", "Peace"};
		System.out.println(new Keyboard_Row_500().findWords(temp)[0]);
	}

}
