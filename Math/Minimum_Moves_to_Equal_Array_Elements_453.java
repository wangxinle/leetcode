package Math;


class Minimum_Moves_to_Equal_Array_Elements_453 {
	
	public int specialNum(int[] nums){
		int max = maxNumber(nums);
		int min = minNumber(nums);
		int flag = max - min;
		int first = 0;
		boolean judge = true;
		for(int i = 0;i < nums.length;i++){
			if(nums[i] == max && first == 0){
				first = 1;
			}
			else if(flag + nums[i] != max){
				judge = false;
				break;
			}
			
		}
		if(judge == true){
			return flag;
		}else{
			return -1;
		}
	}
	
	public int minNumber(int[] nums){
		int min = nums[0];
		for(int i = 1;i < nums.length;i++){
			if(nums[i] < min){
				min = nums[i];
			}
		}
		return min;
	}
	
	public int maxNumber(int[] nums){
		int max = nums[0];
		for(int i = 1;i < nums.length;i++){
			if(nums[i] > max){
				max = nums[i];
			}
		}
		return max;
	}
	
	public boolean number(int[] nums){
		boolean result = true;
		int begin = nums[0];
		for(int i = 1;i < nums.length;i++){
			if(nums[i] != begin){
				result = false;
				break;
			}
		}
		return result;
	}
	
	/*
	public int minMoves(int[] nums) {
		int sp = specialNum(nums);
    	if(specialNum(nums) != -1){
    		return sp;
    	}
        int number = 0;
        while(true){
        	int flag = 0;
        	
        	boolean judge = number(nums);
        	if(judge == true){
        		break;
        	}else{
        		int max = maxNumber(nums);
        		for(int i = 0;i < nums.length;i++){
        			if(nums[i] < max){
        				nums[i]+=1;
        			}else{
        				if(flag == 1){
        					nums[i] += 1;
        				}else{
        					flag = 1;
        				}
        			}
        		}
        		flag = 0;
        		number += 1;
        	}
        }
        return number;
        		
    }
	*/
	
	public int minMoves(int[] nums){
		int result = 0;
		int min = nums[0];
		for(int i = 0;i < nums.length;i++){
			if(nums[i] > min){
				result += nums[i] -min;
			}else{
				result += (min - nums[i])*i;
				min = nums[i];
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		int[] nums ={-11,-62,23,-40,-47,65,27,-74,-36,-29,80,47,62,-25,-59,72,67,-60,-32,-53,-75,3,22,-2,69,-83,-77,60,-28,-98,55,13,-60,-22,25,-54,96,-48,-28,-40,23,-47,-93,-63,-20,-99,61,-53,-59,-71,-54,-34,-16,20,16,-47,-11,39,65,13,41,20,-74,81,51,4,79,47,56,-48,-93,-68,-43,67,-31,-11,68,-69,36,-91,-40,34,-73,-3,-46,43,50,44,-18,-32,-43,-77,88,-64,56,-9,40,36,-62,-4,40,98,28,97,65,50,-62,33,81,26,-6,93,-40,21,-10,-34,-36,93,-90,-2,-39,-80,21,-99,-92,-71,-7,48,65,31,96,-43,29,-23,-94,-54,-73,-56,31,60,70,-75,53,-70,-2,-56,-51,14,89,-89,-88,-50,-69,-15,-97,-61,15,-4,39,-68,80,36,-58,-39,-87,-52,8,92,-7,91,52,-85,-83,5,98,-33,1,-53,34,-10,-42,46,-8,-58,84,-4,-67,-49,44,73,-65,24,9,-23,86,-26,26,-54,-34,71,89,-82,86,58,23,36,-74,77,83,60,-33,94,-42,12,-64,-58,-92,-31,-55,52,-58,-19,-71,3,58,67,77,-64,65,95,-93,54,-87,46,13,-11,-18,39,-34,-82,-49,-15,-88,9,49,-100,4,57,-31,49,-38,-36,-70,-9,19,41,-90,-51,77,75,-56,37,29,-90,-65,-58,-1,-31,33,17,-13,84,54,-49,-54,4,-49,50,-87,-27,-49,-25,37,-66,18,-44,75,28,5,4,3,2,-59,85,12,-24,-73,-89,-2,13,-20,85,-3,86,89,-5,-10,-60,-55,-44,13,-3,-17,-98,31,-98,-41,-42,-18,16,62,38,-82,-96,23,30,-68,2,-7,-18,-85,25,-32,-35,-36,-43,60,6,-51,-94,62,15,-45,-54,17,38,-100,76,96,-18,-55,10,-80,-85,-34,43,-2,-49,-54,43,33,-39,-79,-99,-22,-15,-90,-61,91,-88,97,54,27,-48,-100,-56,42,-100,73,-10,-66,70,-100,-45,85,-33,50,-17,18,96,79,-49,-90,-100,-95,-12,-15,67,-21,-24,79,-24,82,-42,28,34,3,-78,-14,-72,12,21,98,13,76,35,80,-22,71,-2,-25,50,1,-63,50,6,-23,87,-74,57,-85,-95,-67,98,-84,14,32,19,36,-81,-1,-51,-8,-51,62,-80,84,-6,-2,55,44,25,-43,-55,62,-93,4,92,46,30,49,62,-13,34,60,3,-52,-56,74,37,-85,-27,38,7,22,-48,27,-41,46,-74,-86,-58,51,-76,-13,-34,83,43,-42,30,-27,59,-8,13,-7,-96,-84,-6,-52,91,-69,-84,-84,69,23,-9,73,-97,50,19,81,16,13,-16,40,-100,50,24,-4,60,-46,21,19,-2,-66,65,2,-49,-41,2,94,-58,18,-90,63,94,-47,36,97,-97,-93,78,20,20,-38,-88,-28,65,36,68,25,42,-58,97,-60,-24,62,-6,-21,73,97,-75,67,-33,88,30,-39,-59,-82,-90,-55,-75,40,17,-3,-97,29,69,20,-34,-10,97,-92,32,46,-99,60,-40,-5,-60,-67,-56,-83,-100,12,-95,-18,25,-53,0,36,-56,-23,-24,61,74,-69,-10,44,3,8,86,1,-31,18,99,-30,-22,-40,65,-30,-55,-90,-12,-54,22,-55,-20,99,-8,81,-13,-12,-90,16,-51,85,47,-8,-19,-97,52,-33,-44,-79,37,-45,-9,-85,15,-43,-62,61,-33,-22,59,41,23,-61,-8,68,72,80,-44,35,-4,-42,20,95,2,-99,98,-46,-80,-46,-24,57,-38,67,72,77,76,62,-10,95,-60,-99,-12,16,93,81,-16,65,61,-8,0,-43,2,72,-96,-96,25,-97,-41,45,-91,-13,2,-29,-46,-73,-99,83,41,-57,78,82,-55,-33,-50,-62,-52,34,55,61,78,-92,70,-19,80,74,-63,6,29,-4,-97,39,35,-42,62,90,-15,15,25,-74,59,3,60,-96,22,-90,-58,70,-4,97,-17,-73,-95,-47,8,38,-72,45,96,9,94,99,-52,29,-43,63,-29,-6,-22,96,-27,89,-48,-67,93,74,96,87,-3,-56,37,80,-29,-6,-66,79,-68,-86,-23,-72,23,-77,80,24,4,89,-13,76,-16,17,24,57,7,76,42,-48,3,-10,-60,-100,35,77,80,-94,-29,66,38,-44,80,67,-64,-44,90,68,80,-6,58,-81,-78,94,-12,47,3,95,-25,97,-100,78,-12,92,30,-77,69,-37,81,92,-71,19,-100,-90,-14,89,-34,-72,57,98,23,15,-83,-3,-39,5,96,64,-47,-28,62,-95,-98,-50,97,-15,-75,18,48,-94,-38,77,-22,-37,39,16,-48,57,45,61,55,-80,-23,24,17,-10,82,14,-45,87,38,-83,92,-8,-81,41,77,96,-41,25,-98,-27,-45,-68,36,94,49,40,4,-6,2,-41,14,31,36,83,-79,-30,-3,-72,-43,87,97,-99,-20,68,-6,-43,64,53,35,19,-74,90,51,15,36,-48,-93,-60,46,-39,-48,-88,44,88,96,18,-90,-55,46,-81,-67,-4,-80,-35,-36,-34,22,-71,-81,-91,48,97,51,-49,-36,-12,4,-28,28,-98,-15,32,-85,-70,-28,63,48,-18,60,-54,1,45,42,-27,-90,-93,39};
		System.out.println(new Minimum_Moves_to_Equal_Array_Elements_453().minMoves(nums));
		
				
	}
	
}
