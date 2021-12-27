class Solution {
    public boolean isPalindrome(int x) {
        int res = 0;
        int palin = x;
        while(x != 0){
            int rev = x %10;
            res = res*10 + x %10;
            x = x/10;
            
            
            
        }
        
      if(palin == res && res >=0)  
          
           return true;
        
        else
            return false;
        
        
        
        
    }
}