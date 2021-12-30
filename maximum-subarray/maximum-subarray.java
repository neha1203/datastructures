class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length == 0 )
            return 0;
        if(nums.length == 1)
            return nums[0];
        
        // if(nums.length == 2)
        //     return nums[0] + nums[1];
        
        int max = nums[0];
        int res = nums[0];
     for( int i = 1 ; i<nums.length;i++){
         
         max = Math.max(nums[i], max+nums[i]);
             res = Math.max(max,res);
         
         
       
     }   
        
    return res;    
        
    }
}