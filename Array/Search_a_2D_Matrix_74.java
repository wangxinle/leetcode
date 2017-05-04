package Array;

public class Search_a_2D_Matrix_74 {
	
	public boolean searchMatrix_binary(int[][] matrix, int target) {
		boolean judge = false;
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
        	return judge;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int r = m*n-1;
        while(l < r){
        	int middle = ( l + r - 1)/2;
        	if(matrix[middle / n][middle % n] < target){
        		l = middle + 1;
        	}else{
        		r = middle;
        	}
        }
        return matrix[l / n][l % n] == target;
	}
	

	public boolean searchMatrix(int[][] matrix, int target) {
        boolean judge = false;
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
        	return judge;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int begin_m  = 0;
        int end_m = m-1;
        while(begin_m < end_m){
        	int middle = (begin_m + end_m)/2;
        	if(matrix[middle][0] > target){
        		end_m = middle - 1;
        	}else if(matrix[middle][0] < target){
        		begin_m = middle + 1;
        	}else{
        		return true;
        	}
        }
        for(int i = 0;i < end_m;i++){
        	if(matrix[i][n-1] > target){
        		continue;
        	}else{
        		int begin = 0;
        		int end = n-1;
        		while(begin <= end){
                	int middle = (begin + end)/2;
                	if(matrix[i][middle] > target){
                		end = middle - 1;
                	}else if(matrix[i][middle] < target){
                		begin = middle + 1;
                	}else{
                		return true;
                	}
                }
        	}
        }
        return judge;
    }
}
