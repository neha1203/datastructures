// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] arr= new int[n];
	       for(int i=0;i<n;i++) {
	           arr[i] = in.nextInt();
	       }
	       System.out.println(new Solution().countSubarrWithEqualZeroAndOne(arr, n));
	   }
	 }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        int curr = 0;
        int k = 0;
        
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = arr[i]==0?-1:1;
            
            
        }
        
        
        for( int i = 0 ; i<n ; i++){
            
            curr = curr + arr[i];
            
            if(curr == 0)
            k++;
            
            
            if(hs.containsKey(curr))
            
               k = k + hs.get(curr);
            
           if(!hs.containsKey(curr))
              hs.put(curr,1);
             else
             
               hs.put(curr, hs.get(curr)+1);
        
        }
       return k; 
        
        
        // add your code here
    }
}


