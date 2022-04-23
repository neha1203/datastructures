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
        
        HashMap<Integer,Integer> hs = new HashMap<>();
        int curr_sum = 0;
        int count = 0;
        
        
        for( int i = 0 ; i<n ;i++){
            if(arr[i] == 0)
               arr[i] = -1;
               
            curr_sum = curr_sum + arr[i];
            if(curr_sum == 0)
              count++;
              
            if(hs.containsKey(curr_sum))
            
              count = count + hs.get(curr_sum);
            
            if(!hs.containsKey(curr_sum))
                 hs.put(curr_sum, 1);
                else
                
            hs.put(curr_sum, hs.get(curr_sum)+1);
            
            
            
            
            
            
        }
        
        return count;
        
        // add your code here
    }
}


