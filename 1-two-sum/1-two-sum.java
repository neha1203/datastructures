class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hs = new HashMap<>();
        int[] num = new int[2];
        
        for( int i = 0 ; i<nums.length;i++){
            
            int sum = target-nums[i];
            if(hs.containsKey(sum)){
                
             num[0] = i;
             num[1] = hs.get(sum);   
                
                
            }
            
          else{
              
              hs.put(nums[i],i);
              
          }  
            
            
        }
        
        
       return num; 
        
    }
}