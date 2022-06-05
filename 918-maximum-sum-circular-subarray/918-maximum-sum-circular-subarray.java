class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        
        if(nums.length == 0)
             return 0;
        
    if( nums.length == 1)
         return nums[0];
        
        int max = nums[0];
        int res = nums[0];
        int totalSum = 0;
        for( int i = 0 ; i<nums.length;i++)
             totalSum = totalSum + nums[i];
        
        
        for( int i = 1 ; i<nums.length ;i++)
        {
            max = Math.max(nums[i], nums[i]+max);
            res = Math.max(max,res);
            
            
        } 
            
       int min = 0;
        int minRes = 0;
        
           for( int i = 0 ; i<nums.length ;i++)
        {
            min = Math.min(nums[i], nums[i]+min);
            minRes = Math.min(min,minRes);
            
            
        }   
        
        
      if( totalSum == minRes)
          return res;
        
         return Math.max(totalSum-minRes, res);
        
        
    }
    
    
   
}