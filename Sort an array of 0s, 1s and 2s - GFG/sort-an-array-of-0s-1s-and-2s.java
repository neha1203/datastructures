// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
        for( int i = 0 ; i<a.length ; i++){
            
            
            switch(a[i]){
            
            case 0:
                count0++;
                break;
                
            case 1:
                count1++;
                break;
            default :
               count2++;
               break;
            
            
            
            
            
            
            
            
            }   
            
            
            
            
            
        }
        
        int i = 0;
        while(count0> 0){
            
         a[i] = 0;
         count0--;
         i++;
            
            
        }
        while(count1> 0){
            
         a[i] = 1;
         count1--;
         i++;
            
            
        }
          
          
                while(count2> 0){
            
         a[i] = 2;
         count2--;
         i++;
            
            
        }  
            
        
        
        
        
        
        // code here 
    }
}

// { Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends