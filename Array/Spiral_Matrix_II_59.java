package Array;

public class Spiral_Matrix_II_59 {

	public int[][] generateMatrix(int n) {
		
        int[][] result = new int[n][n];
        int left = 0;
        int right = n -1;
        int top = 0;
        int low = n-1;
        int num = 1;
        while(left <= right){
        	for(int i = left;i <= right;i++){
        		result[top][i] = num;        		
        		num += 1;
        	}
        	top += 1;
        	for(int i = top;i <= low;i++){
        		result[i][right] = num;
        		num += 1;
        	}
        	right -= 1;
        	for(int i = right;i >= left;i--){
        		result[low][i] = num;
        		num += 1;
        	}
        	low -= 1;
        	for(int i = low;i >= top;i--){
        		result[i][left] = num;
        		num += 1;
        	}
        	left += 1;
        	
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = new Spiral_Matrix_II_59().generateMatrix(0);
		System.out.println(data);
		for(int i = 0;i < data.length;i++){
			for(int j = 0;j < data[0].length;j++){
				System.out.println(data[i][j]);
			}
		}
	}

}
