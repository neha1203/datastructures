class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        
      int max = -1;
        HashMap<Character,Integer> hs = new HashMap<>();
        int i = 0;
        int j = 0;
        int n = s.length();
        
        if(n==1)
            return 1;
        if(n==0)
            return 0;
        
        
        
        while(j<n){
            if(!hs.containsKey(s.charAt(j))){
                hs.put(s.charAt(j),1);
            }
            else
            
           hs.put(s.charAt(j), hs.get(s.charAt(j))+1); 
            
          if(hs.size()> j-i+1)
               j++;
          else  if( hs.size() == j-i+1){
                max = Math.max(max,j-i+1);
                j++;
                
                
            }
            
            else if ( hs.size() < j-i+1){
              while( hs.size()< j-i+1){
                  hs.put(s.charAt(i),hs.get(s.charAt(i))-1);
                  if(hs.get(s.charAt(i))==0)
                      hs.remove(s.charAt(i));
                      
                 i++;
                  }
                  
               // i++;  
              j++;
              }  
            //  j++;  
                
                
                
                
                
                
                
            }
            
            
            
            
            
            
            
            
        
        
               
               
               
               
               
         return max;      
    
           
           
         
        
        
    }
}