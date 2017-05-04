package Array;

public class Unique_Paths_62 {
	
	public int uniquePaths(int m, int n) {
        if(m <= 0 || n <= 0 || m*n == 1){
        	return 0;
        }
        if(m * n == 1){
        	return 1;
        }
        int num = 0;
        if(m * n == 2){
        	num += 1;
        }else{
        	 num += uniquePaths(m-1, n) + uniquePaths(m, n-1);
        }
        return num;
    }
	
	public int uniquePathsNew(int m ,int n){
		if(m * n<= 0){
			return 0;
		}
		int[][] data = new int[m][n];
		for(int i = 0;i < m;i++){
			data[i][0] = 1;
		}
		
		for(int j = 0;j < n;j++){
			data[0][j] = 1;
		}
		for(int i = 1;i < m;i++){
			for(int j = 1;j < n;j++){
				data[i][j] += data[i][j-1] + data[i-1][j];
			}
		}
		return data[m-1][n-1];
	}
	
	public static void main(String[] args){
		System.out.println(new Unique_Paths_62().uniquePathsNew(99, 99));
	}
}
