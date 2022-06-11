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
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> hs = new HashMap<>();
        int curr = 0;
        int start = 0;
        int end = -1;;
        for (int i = 0 ; i<n ; i++){
            
            
            curr = curr + arr[i];
            
            if( curr == s){
                start = 0;
                end = i;
                break;
                
            }
           // hs.put(0,-1);
            
          if(hs.containsKey(curr-s)){
              start = hs.get(curr-s)+1;
              end = i;
              break;
              
              
          }  
          else
          
           hs.put(curr,i);
            
            
            
            
        }
        
        if( end != -1){
           al.add(start+1);
           al.add(end+1);
           return al;
            
        }
        else
          al.add(-1);
          
          return al;
        
        // Your code here
    }
}