package Array;

public class Teemo_Attacking_495 {
	
	public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        if(timeSeries == null || timeSeries.length == 0){
        	return result;
        }
        int begin = timeSeries[0];
        for(int i = 1;i < timeSeries.length;i++){
        	result += begin + duration <= timeSeries[i]?duration:timeSeries[i] - begin;
        	begin = timeSeries[i];
        }
        result += duration;
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
