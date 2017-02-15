package LeetCode;

import java.util.ArrayList;

public class Excel_Sheet_Column_Title_168 {

	public String convertToTitle(int n) {
		StringBuffer result = new StringBuffer("");
		ArrayList<Integer> data = new ArrayList<Integer>();
		while(n > 0){
			int temp = n%26;
			n = n/26;
			data.add(temp);
			//result.append((char)(temp+64)+"");			
		}
		for(int i = 0;i < data.size();i++){
			if(data.get(i) <= 0 && i+1 < data.size()){
				result.append((char)(data.get(i)+26+64)+"");
				data.set(i+1, data.get(i+1) - 1);
			}else if(data.get(i) <= 0 && i+1 == data.size()){
				break;
			}else{
				result.append((char)(data.get(i)+64)+"");
			}
		}
        return result.reverse().toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Excel_Sheet_Column_Title_168().convertToTitle(109));
	}

}
