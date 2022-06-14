// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int sum = k;
        HashMap<Integer,Integer> hs = new HashMap<>();
        int count = 0;
        
        for( int i = 0 ; i<n ; i++){
            
            if(!hs.containsKey(arr[i]))
              hs.put(arr[i],1);
            
            else
            hs.put(arr[i],hs.get(arr[i])+1);
            
            
        }
        
      for( int i = 0 ; i<n;i++){
          
          if(hs.containsKey(sum-arr[i]))
            count = count + hs.get(sum-arr[i]);
          
          if(sum-arr[i] == arr[i])
            count--;
          
          
          
          
      }  
        
      return count/2;  
        
        
        // code here
    }
}
