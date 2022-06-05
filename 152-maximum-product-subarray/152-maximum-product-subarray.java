class Solution {
    public int maxProduct(int[] nums) {
        if( nums.length == 0)
            return 0;
        if( nums.length == 1)
            return nums[0];
        
        
        
        int maxVal = nums[0];
        int minVal = nums[0];
        int res = nums[0];
        
        for( int i = 1 ; i<nums.length ; i++){
            if( nums[i]<0){
                int temp = maxVal;
                maxVal = minVal;
                minVal = temp;
                
                
            }
            
            
          maxVal = Math.max( nums[i],nums[i]*maxVal);  
             minVal = Math.min( nums[i],nums[i]*minVal); 
            
            
         res = Math.max(maxVal,res);   
            
            
            
        }
        
        
      return res;  
        
    }
}