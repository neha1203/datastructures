class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         if(nums.length==0||target==0) return 0;
        
        int left = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for( int i = 0 ; i<nums.length;i++){
          sum = sum+nums[i];
            
            while(sum>=target){
                ans = Math.min(ans,i+1-left);
                sum =  sum  - nums[left];
                left++;
                
                
            }
            
            
            
            
            
            
            
        }
        
        
        return (ans!=Integer.MAX_VALUE)?ans:0; 
        
        
    }
}