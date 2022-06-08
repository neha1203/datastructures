class Solution {
    public int maxProfit(int[] prices) {
        
        int length = prices.length;
        int[] buy = new int[length];
        int[] sell = new int[length];
        int[] notHold = new int[length];
        int[] hold = new int[length];
        
        
          buy[0] = 0 - prices[0];
        sell[0] = Integer.MIN_VALUE; 
        notHold[0] = 0;
        hold[0] = Integer.MIN_VALUE; //Not possible at 0 because not possible previously holding or buying anything
        
        
        for( int i = 1 ; i<prices.length;i++){
            buy[i] = notHold[i-1] - prices[i];
            sell[i] = Math.max(buy[i-1],hold[i-1])+ prices[i];
            notHold[i] = Math.max( sell[i-1],notHold[i-1]);
            hold[i] = Math.max(buy[i-1], hold[i-1]);
            
            
            
            
            
            
        }
        
       return Math.max(sell[length-1],notHold[length-1]);
        
    }
}