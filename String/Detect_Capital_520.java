package String;

public class Detect_Capital_520 {

	public boolean detectCapitalUse(String word) {
        boolean judge = true;
        if(word == "" || word.length() == 1){
        	return judge;
        }
        char[] data = word.toCharArray();
        char start = data[0];
        if(start >= 'A' && start <= 'Z'){
        	char second = data[1];
        	if(second >= 'A' && second <= 'Z'){
        		for(int i = 2;i < data.length;i++){
        			if(data[i] >= 'A' && data[i] <= 'Z'){
                		continue;
                	}else{
                		judge = false;
                		break;
                	}
                }
        	}else{
        		for(int i = 2;i < data.length;i++){
        			if(data[i] >= 'a' && data[i] <= 'z'){
                		continue;
                	}else{
                		judge = false;
                		break;
                	}
                }
        	}
        	
    	}else{
    		for(int i = 1;i < data.length;i++){
            	if(data[i] >= 'a' && data[i] <= 'z'){
            		continue;
            	}else{
            		judge = false;
            		break;
            	}
            }
    	}
        
        return judge;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
