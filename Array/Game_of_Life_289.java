package Array;

public class Game_of_Life_289 {

	public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0){
        	return;
        }
        int m = board.length;
        int n = board[0].length;
        for(int i = 0;i < m;i++){
        	for(int j = 0;j < n;j++){
        		int num = numOfLife(board, m, n, i, j);
        		if(board[i][j] == 0 && num == 3){
        			board[i][j] = 2;
        		}
        		else if(board[i][j] == 1 && (num == 2 || num == 3 )){
        			board[i][j] = 3;
        		}
        	}
        }
        for(int i = 0;i < m;i++){
        	for(int j = 0;j < n;j++){
        		board[i][j] >>= 1;
        	}
        }
    }
	
	public int numOfLife(int[][] board,int m,int n,int i,int j){
		int num = 0;
		for(int k = Math.max(i-1, 0);k <= Math.min(i+1, m-1);k++){
			for(int l = Math.max(j-1, 0);l <= Math.min(j+1, n-1);l++){
				num += board[k][l] & 1;
			}
		}
		num -= board[i][j] & 1;
		return num;
	}
}
