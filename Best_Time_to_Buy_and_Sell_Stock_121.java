package LeetCode;


public class Best_Time_to_Buy_and_Sell_Stock_121 {

	public int maxProfit(int[] prices) {
    		int max = 0;
		for(int i = 0;i < prices.length - 1;i++){
			for(int j = i+1;j < prices.length;j++){
				if(prices[j] - prices[i] > max){
					max = prices[j] - prices[i];
				}
			}
		}
		return max;
    }
	
	public int maxProfit_1(int[] prices){
		int max = 0;
		int i = 0;
		int j = 1;
		while(j < prices.length){
			if(prices[j] - prices[i] > max){
				max = prices[j] - prices[i];
			}else if(prices[i] < prices[j]){
				j++;
			}else if(prices[i] >= prices[j]){
				i = j;
				j++;
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[3];
		a[0] = 11;
		a[1] = 1;
		a[2] = 3;
		System.out.println(new Best_Time_to_Buy_and_Sell_Stock_121().maxProfit_1(a));
	}

}
