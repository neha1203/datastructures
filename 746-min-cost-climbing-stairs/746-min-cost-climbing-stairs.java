class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int size  = cost.length;
        int[] fib = new int[size+1];
        fib[0] = cost[0];
        fib[1] = cost[1];
        
        
        for( int i = 2 ; i<size ; i++){
            
            
            fib[i] = Math.min(fib[i-1],fib[i-2])+ cost[i];
            
            
            
            
            
        }
        
        
        
        return Math.min(fib[size - 1], fib[size - 2]);
        
        
        
    }
}