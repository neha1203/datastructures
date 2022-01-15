// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        
        int start = 0;
        int end = -1;
       int  curr_sum = 0;
        ArrayList<Integer> hm = new ArrayList<>();
        
        HashMap<Integer,Integer> hs = new HashMap<>();
        
        for( int i = 0 ; i<n;i++){
            
            curr_sum = curr_sum + arr[i];
            
            
            if(curr_sum - s == 0){
                start = 0;
                end = i;
                
               break;
                
                
                
            }
           if(hs.containsKey(curr_sum - s))
           
           {
               
               start = hs.get(curr_sum-s)+1;
               end = i;
               break;
               
           }
           hs.put(curr_sum,i); 
            
        }
        
        if(end == -1)
        {
            
            hm.add(end);
            
            return hm;
        }
        hm.add(start+1);
        hm.add(end+1);
        
        return hm;
        
        
        // Your code here
    }
}