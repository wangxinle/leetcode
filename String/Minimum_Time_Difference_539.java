package String;

import java.util.Arrays;
import java.util.List;

public class Minimum_Time_Difference_539 {

	public int findMinDifference(List<String> timePoints) {
        
		int[] time = new int[timePoints.size()];
		for(int i = 0;i < timePoints.size();i++){
			String[] time_temp = timePoints.get(i).split(":");
			time[i] = 60*Integer.parseInt(time_temp[0]) + Integer.parseInt(time_temp[1]);
		}
		Arrays.sort(time);
		int min = Integer.MAX_VALUE;
		for(int i = 1;i < time.length;i++){
			min = Math.min(min, time[i] - time[i-1]);
		}
		
		return Math.min(min, time[0] + 60*24 - time[timePoints.size() - 1]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
