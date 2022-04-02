class Solution {
    
    public String findCommon(String s1,String s2){
        String res = "";
        
       for( int i = 0, j = 0;i<s1.length()&&j<s2.length();i++,j++) {
          if(s1.charAt(i)!=s2.charAt(j))
              return res;
           else
               
           res = res + s1.charAt(i);
           
       }
       
      return res;  
    }
    
    
    
    
    public String longestCommonPrefix(String[] strs) {
        
        
  String prefix = strs[0];
        
  for( int i = 1; i<strs.length;i++){
      
      
      
      prefix = findCommon(prefix,strs[i]);
  }      
    
        
        if(prefix.length() == 0)
            return "";
        
        else
            return prefix;
        
        
        
        
        
        
        
        
        
        
        
    }
}