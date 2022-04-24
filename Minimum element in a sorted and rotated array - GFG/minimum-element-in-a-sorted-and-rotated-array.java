// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findMin(A, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findMin(int arr[], int n)
    {
   
     int min = pivot(arr, 0, n-1);
        
        
        
       return min; 
        
        //complete the function here
    }
    
    int pivot(int arr[], int low, int high){
    
    
    if(low>= high)
       return arr[0];
    if(low == high)
     return arr[low];
     
     int mid =   low + (high - low)/2; 
     
     
     if(mid< high && arr[mid] >  arr[mid+1])
        return arr[mid+1];
        
     if(mid> low && arr[mid] < arr[mid-1] )
       return arr[mid];
       
       if(arr[low]>= arr[mid])
        return  pivot(arr,low,mid-1);
          
        else
       return pivot(arr,mid+1, high);
        
        
         
        
    }
    
    
}
