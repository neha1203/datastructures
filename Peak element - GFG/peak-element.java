// { Driver Code Starts
import java.util.*;
class PeakElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
		    int[] tmp=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				tmp[i] = a[i];
			}
		    
		    int f=0;
			int A=(new Solution()).peakElement(tmp,n);
			
			if(A<0 && A>=n)
			    System.out.println(0);
			else
			{
    			if(n==1 && A==0)
    			    f=1;
    			else if(A==0 && a[0]>=a[1])
    			    f=1;
    			else if(A==n-1 && a[n-1]>=a[n-2])
    			    f=1;
    			else if(A >= 0 && A < n && a[A] >=a[A+1] && a[A]>= a[A-1])
    			    f=1;
    			else
    			    f=0;
			    System.out.println(f);
			}
		}
	}
}// } Driver Code Ends


/*Complete the function below*/

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
        if( n == 0)
         return 0;
        if( n == 1)
          return 0;
        if( arr[0] > arr[1])
          return 0;
          
        if( arr[n-1] > arr[n-2])
          return n-1;
           int low = 0;
        int high  = n-1;
        
          
          
      while( low <= high)    {
          
          int mid = low + (high - low) / 2;
          
          if(arr[mid]> arr[mid+1] && arr[mid]> arr[mid-1])
              return mid;
              
          else if(  mid > 0 && arr[mid] < arr[mid-1] )
             high = mid-1;
              
          else
            low = mid+1;
          
          
          
      }  
          
        
        
      return 0;  
       
        
       //add code here.
    }
}