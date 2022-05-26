class Solution {
    public int fib(int n) {
        
        int[] fibNumber = new int[n+2];
        fibNumber[0] = 0;
        fibNumber[1] = 1;
        
        
    // if( n == 0)
    //      return 0;
    // if(n == 1)
    //     return 1;
    //  if(n == 2)
    //      return 1;
        
        for( int i = 2 ; i<=n ; i++){
            
          fibNumber[i] = fibNumber[i-1] + fibNumber[i-2];  
            
            
        }
        
      return fibNumber[n];  
        
    }
}