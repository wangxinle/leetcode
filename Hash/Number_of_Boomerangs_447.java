package Hash;

import java.util.HashMap;

public class Number_of_Boomerangs_447 {
	
	public int distancePoint(int[] x,int[] y){
		return (x[0]-y[0])*(x[0]-y[0]) + (x[1] - y[1])*(x[1] - y[1]);
	}
	
	public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        for(int i = 0;i < points.length;i++){
        	HashMap<Integer, Integer> data = new HashMap<>();
        	for(int j = 0;j< points.length;j++){
        		if(i == j){
        			continue;
        		}
        		int distance = distancePoint(points[i], points[j]);
        		data.put(distance, data.getOrDefault(distance, 0) + 1);
        	}
        	for(int val:data.values()){
            	System.out.println(val);
            	result += val*(val-1);
            }
        }
        
        return result;
    }
	public static void main(String[] args) {
		int[][] data = new int[3][2];
		// TODO Auto-generated method stub
		data[0][0] = 0;
		data[0][1] = 0;
		data[1][0] = 1;
		data[1][1] = 0;
		data[2][0] = 2;
		data[2][1] = 0;
		System.out.println(new Number_of_Boomerangs_447().numberOfBoomerangs(data));

	}

}
