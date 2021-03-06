package Array;

import java.util.List;

public class Triangle_120 {

	public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = triangle.size() - 2;i >= 0;i--){
        	for(int j = 0;j < i+1;j++){
        		if(triangle.get(i+1).get(j) < triangle.get(i+1).get(j+1)){
        			triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i+1).get(j));
        		}else{
        			triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i+1).get(j+1));
        		}
        	}
        }
        return triangle.get(0).get(0);
    }
}
