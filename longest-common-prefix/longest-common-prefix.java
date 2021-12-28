class Solution {
    
    
    public String findPrefix(String a , String b){
        String  res = "";
        
        for( int i =0,j=0; i<a.length()&& j<b.length(); i++,j++){
            
            if(a.charAt(i)!= b.charAt(j))
                
                return res;
            
            else{
                
                res = res + a.charAt(i);
            }
            
            
        }
        
        
        
        
    return res;    
        
        
        
        
    }
    
    
    public String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0];
        
        for( int i = 1 ; i<strs.length; i++){
            
            prefix = findPrefix(strs[i],prefix);
        }
        
   if(prefix.length()>0)
       return prefix;
        
        else
            return "";
        
        
    }
}