class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        ArrayList<Integer> row,previus = null;
        
        for( int i = 0  ; i<numRows;i++)
        {
            row = new ArrayList<Integer>();
            
         for( int j = 0 ; j<=i;j++)
         {
             
         if( j ==0 || j == i)
             row.add(1);
          else
          {
              row.add(previus.get(j-1)+ previus.get(j));
              
          }
         }      
            previus = row;
            ans.add(row); 
             
             
         
            
            
            
        }
        
       return ans; 
        
    }
}