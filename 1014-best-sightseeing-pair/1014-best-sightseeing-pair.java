class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        
        
        int ans  = 0;
        int nums1 = values[0]+0;
        
        for( int i = 1 ; i<values.length;i++){
            
          ans = Math.max(ans,nums1+values[i]-i);
           nums1 = Math.max( nums1,values[i]+i); 
            
            
            
        }
        return ans;
    }
}