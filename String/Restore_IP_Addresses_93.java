package String;

import java.util.ArrayList;
import java.util.List;

public class Restore_IP_Addresses_93 {
	
	public List<String> restoreIpAddresses(String s) {
		ArrayList<String> result = new ArrayList<>();
        if(s.length() > 12){
        	return result;
        }
        
        
        int position = 0;
        int count = 0;
        helper(result,s,position,count,"");
        return result;
    }
	
	public void helper(ArrayList<String> result,String s,int position,int count,String data){
		if(count > 4){
			return;
		}
		if(position == s.length() && count == 4){
			result.add(data);
			return;
		}
		for(int i = 1;i < 4;i++){
			if(position + i > s.length()){
				break;
			}
			String temp = s.substring(position,position+i);
			if((temp.startsWith("0") && temp.length() > 1) || (Integer.parseInt(temp) > 255)){
				continue;
			}
			helper(result, s, position + i, count+1, data+temp+(count==3?"":"."));
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> result = new Restore_IP_Addresses_93().restoreIpAddresses("25525511135");
		for(int i = 0;i < result.size();i++){
			System.out.println(result.get(i));
		}
	}

}
