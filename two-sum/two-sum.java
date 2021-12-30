class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int res[] = new int[2];
        
        HashMap<Integer,Integer> hs = new HashMap<>();
        for( int i = 0 ; i<nums.length ; i++){
            
           int sum = target - nums[i];
            
            if(hs.containsKey(sum)){
                
               res[0] = i;
                res[1] = hs.get(sum);
                
            }
          else
              hs.put(nums[i],i);
            
            
        }
        
       return res; 
    }
}