package Hash;


public class Island_Perimeter_463 {

	public int islandPerimeter(int[][] grid) {
        int result = 0;
        int neighbour = 0;
        for(int i = 0;i < grid.length;i++){
        	
        	for(int j = 0;j < grid[i].length;j++){
        		if(grid[i][j] == 1){
        			result += 1;
        			if(i+1 < grid.length && grid[i+1][j] == 1){
        				neighbour += 1;
        			}
        			if(j+1 < grid[i].length && grid[i][j+1] == 1){
        				neighbour += 1;
        			}
        		}
        		
        	}
        	
        }
        
        return result*4  - neighbour*2;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
