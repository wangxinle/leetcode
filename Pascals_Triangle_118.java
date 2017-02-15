package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_118 {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		for(int i = 0;i < numRows;i++){
			if(i == 0){
				List<Integer> temp = new ArrayList<>();
				temp.add(1);
				result.add(temp);
			}
			else if(i == 1){
				List<Integer> temp = new ArrayList<>();
				temp.add(1);
				temp.add(1);
				result.add(temp);
			}else{
				List<Integer> temp = new ArrayList<>();
				temp.add(1);
				List<Integer> middle = result.get(i-1);
				
				for(int j = 0;j < middle.size()-1;j++){
					temp.add(middle.get(j)+middle.get(j+1));
				}
				temp.add(1);
				result.add(temp);
			}
		}
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
