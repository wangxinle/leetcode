package Array;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III_216 {
	
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		helper(result,new ArrayList<>(),k,n,1);
        return result;
    }

	public void helper(List<List<Integer>> result,List<Integer> list, int k, int target, int start){
		if(target == 0 && k == 0){
			result.add(new ArrayList<>(list));
		}else{
			for(int i = start;i <= 9 && target > 0 && k > 0;i++){
				list.add(i);
				helper(result, list, k-1, target-i, i+1);
				list.remove(list.size() - 1);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> data = new Combination_Sum_III_216().combinationSum3(3, 9);
		for(int i = 0;i < data.size();i++){
			for(int j = 0;j < data.get(i).size();j++){
				System.out.print(data.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

}
