package LeetCode;

import java.util.*;
public class Count_and_Say_38 {

	public String countString(String data){
		String result = "";
		char[] temp = data.toCharArray();
		int count = 0;
		char begin = temp[0];
		for(int i = 0;i < temp.length;){
			if(begin == temp[i]){
				count++;
				i++;
			}else{
				result += count+""+begin;
				count = 0;
				begin = temp[i];				
			}
		}
		if(count >= 1){
			result += count+""+begin;
		}
		return result;
	}
	public String countAndSay(int n) {
		List<String> data = new ArrayList<>();
		if(n == 0){
			return null;
		}else if(n == 1){
			return "1";
		}else{
			data.add("1");
			int i = 0;
			while(i < n-1){
				String temp = countString(data.get(i));
				data.add(temp);
				i++;
			}
		}
		
		return data.get(data.size()-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Count_and_Say_38().countAndSay(2));
	}

}
