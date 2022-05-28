// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        
        ArrayList<Integer> hs = new ArrayList<>();
        
        int top = 0;
        int left = 0;
        int bottom = r-1;
        int right = c-1;
        int i;
        
        
        int direction = 0;
        
        
        while( top<= bottom && left <= right){
            if(direction == 0){
                for( i = left ; i <= right; i++)
                    hs.add(matrix[top][i]);
                    top = top +1;
                    
                    
                
            }
              else if( direction == 1) { 
                for( i = top ; i <= bottom; i++)
                    hs.add(matrix[i][right]);
                    right = right -1;
                    
                    
                
              }
              else if( direction == 2)  {
                for( i = right ; i >=left; i--)
                    hs.add(matrix[bottom][i]);
                    bottom = bottom -1;
                    
                    
                
              }
                else if( direction == 3)  {
                for(  i = bottom ; i >=top; i--)
                    hs.add(matrix[i][left]);
                    left = left +1;
                    
                    
                
                }
                
                direction = (direction+1)%4;
                
            }
            
            return hs;
            
            
            
            
            
            
            
            
            
        
        
        
        // code here 
    }
}
