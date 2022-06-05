class Solution {
    public int jump(int[] nums) {
        
        
        if(nums.length == 0)
             return -1;
        
        if(nums.length <= 1)
            return 0;
        
        
        
        int maxReach = nums[0];
            int steps = nums[0];
        int jump = 1;
        
        
        for( int i = 1 ; i<nums.length ; i++){
            
            if( i == nums.length -1)
                 return jump;
            
            if( i+ nums[i] > maxReach)
                  maxReach = i + nums[i];
              steps --;
            
            if( steps == 0)
            {
                jump++;
                
                if( i>=maxReach )
                     return -1;
                
                
                steps = maxReach - i;
                
                
            }
            
            
            
            
            
            
            
            
        }
        
        
        return -1;
        
        
    }
}