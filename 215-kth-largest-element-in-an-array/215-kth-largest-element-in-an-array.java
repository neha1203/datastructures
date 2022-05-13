class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> hs = new PriorityQueue<>();
        
        
        for( int x : nums){
            hs.add(x);
            
            if(hs.size()> k)
                 hs.remove();
            
            
            
        }
        
        
        return hs.remove();
        
        
    }
}