class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
       
       
        
        
        if(nums.length == 1)
            return dp[0];
         dp[1] = Math.max(nums[0],nums[1]);
        
        if(nums.length == 2)
             return dp[1];
        
         dp[2] = Math.max(nums[0]+ nums[2],nums[1]);
        
        
        if(nums.length == 3)
             return dp[2];
            
            
         for( int i = 3 ; i<nums.length;i++)
             
         {
             dp[i]= Math.max(dp[i-2] , dp[i-3])+ nums[i];
             
             
             
         }
        return Math.max(dp[nums.length-1],dp[nums.length-2]);
        
        
        
    }
}