package Array;

public class Best_Time_to_Buy_and_Sell_Stock_II_122 {

	public int maxProfit(int[] prices) {
        int total = 0;
        for(int i = 0;i < prices.length - 1;i++){
        	if(prices[i+1] > prices[i]){
        		total += prices[i+1] - prices[i];
        	}
        }
        return total;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
