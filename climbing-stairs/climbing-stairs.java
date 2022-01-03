class Solution {
    public int climbStairs(int n) {
        
        if( n==1 || n == 2)
            return n;
        
        
    int start1= 1;
        int start2 = 2;
        int ways= 2;
        int count = 2;
        
        while( count <n){
            
            
            ways = start1+ start2;
            start1= start2;
            start2 = ways;
            count ++;
            
            
            
            
        }
        
        return ways;
        
    }
}