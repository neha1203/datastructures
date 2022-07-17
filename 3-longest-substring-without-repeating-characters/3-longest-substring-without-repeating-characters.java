class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0)
            return 0;
        if(s.length() == 1)
            return 1;
       int n = s.length();
        int res = 0;
        
       for( int i = 0 ; i<n ; i++){
          // int max = 0
           
           boolean visited[] = new boolean[256];
           for( int j = i ; j<n ;j++)
           {
               
               if(visited[s.charAt(j)] == true)
                   break;
               else
               {
                res = Math.max(res,j-i+1);
                visited[s.charAt(j)] =true;   
                   
                   
               }
               
               
               
               
               
               
           }
           
           
           
           visited[s.charAt(i)] = true;
           
           
           
       }
        
        return res;
        
        
    }
}