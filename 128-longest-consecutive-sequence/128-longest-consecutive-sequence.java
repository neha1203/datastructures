class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for( int i = 0 ; i<nums.length;i++){
            
            hs.add(nums[i]);
            
        }
        int large = 0;
        
        for( int i = 0 ; i<nums.length ; i++){
            
            if(!hs.contains(nums[i] -1)){
                
                int j = nums[i];
                int longest = 1;
                
                while( hs.contains(j+1)){
                    
                    j  = j+1;
                    longest = longest +1;
                }
                
                
              large =Math.max(large,longest);   
                
                
                
                
            }
            
            
            
            
            
            
            
        }
        
        return large;
        
    }
}