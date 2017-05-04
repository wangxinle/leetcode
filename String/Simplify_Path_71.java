package String;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Simplify_Path_71 {
	
	public String simplifyPath(String path) {
        Deque<String> data = new LinkedList<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
        for(String str:path.split("/")){
        	if(str.equals("..") && !data.isEmpty()){
        		data.pop();
        	}else if(!skip.contains(str)){
        		data.push(str);
        	}
        }
        String res = "";
        for(String str:data){
        	res = "/" + str +res;
        }
        return res.isEmpty()?"/":"";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
