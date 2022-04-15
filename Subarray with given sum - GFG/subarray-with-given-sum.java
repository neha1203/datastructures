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
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> arrl= new ArrayList<>();
        
        int start = 0;
        int end = -1;
        int curr = 0;
        
        
        for(int i = 0 ; i<n ; i++){
           curr = curr+ arr[i];
           
           if(curr ==s){
               start = 0;
               end = i;
               break;
               
               
           }
           
           
           if(hm.containsKey(curr-s)){
              start = hm.get(curr-s)+1;
              end = i;
              break; 
               
               
               
           }
            
            
         hm.put(curr,i);   
            
            
        }
        
        if(end != -1)
        {
           arrl.add(start+1);
           arrl.add(end+1);
        
        return arrl;
        }
        else
        
        arrl.add(-1);
        
        return arrl;
        
        // Your code here
    }
}